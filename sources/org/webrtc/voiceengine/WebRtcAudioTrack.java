package org.webrtc.voiceengine;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import java.nio.ByteBuffer;
import org.telegram.messenger.FileLog;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;

public class WebRtcAudioTrack {
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_USAGE;
    private static final String TAG = "WebRtcAudioTrack";
    private static ErrorCallback errorCallback;
    private static WebRtcAudioTrackErrorCallback errorCallbackOld;
    private static volatile boolean speakerMute;
    private static int streamType;
    private static int usageAttribute;
    private final AudioManager audioManager;
    private AudioTrackThread audioThread;
    private AudioTrack audioTrack;
    private ByteBuffer byteBuffer;
    private byte[] emptyBytes;
    private final long nativeAudioTrack;
    private final ThreadUtils.ThreadChecker threadChecker;

    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    private class AudioTrackThread extends Thread {
        private volatile boolean keepAlive;
        private long lastPlaybackHeadPosition;
        private long lastTimestamp;
        private long targetTimeNs;
        private long writtenFrames;

        public AudioTrackThread(String str) {
            super(str);
            this.keepAlive = true;
            this.writtenFrames = 0L;
            this.lastPlaybackHeadPosition = 0L;
            this.lastTimestamp = System.nanoTime();
        }

        private int writeBytes(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
            int write;
            if (Build.VERSION.SDK_INT < 21) {
                return audioTrack.write(byteBuffer.array(), byteBuffer.arrayOffset(), i);
            }
            write = audioTrack.write(byteBuffer, i, 0);
            return write;
        }

        @Override
        public void run() {
            long nanoTime;
            Process.setThreadPriority(-19);
            Logging.d("WebRtcAudioTrack", "AudioTrackThread" + WebRtcAudioUtils.getThreadInfo());
            WebRtcAudioTrack.assertTrue(WebRtcAudioTrack.this.audioTrack.getPlayState() == 3);
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            int channelCount = WebRtcAudioTrack.this.audioTrack.getChannelCount() * 2;
            int sampleRate = WebRtcAudioTrack.this.audioTrack.getSampleRate();
            loop0: while (true) {
                this.targetTimeNs = System.nanoTime();
                while (this.keepAlive) {
                    try {
                        WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                        webRtcAudioTrack.nativeGetPlayoutData(capacity, webRtcAudioTrack.nativeAudioTrack);
                        WebRtcAudioTrack.assertTrue(capacity <= WebRtcAudioTrack.this.byteBuffer.remaining());
                        if (WebRtcAudioTrack.speakerMute) {
                            WebRtcAudioTrack.this.byteBuffer.clear();
                            WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                            WebRtcAudioTrack.this.byteBuffer.position(0);
                        }
                        int writeBytes = writeBytes(WebRtcAudioTrack.this.audioTrack, WebRtcAudioTrack.this.byteBuffer, capacity);
                        if (writeBytes != capacity) {
                            Logging.e("WebRtcAudioTrack", "AudioTrack.write played invalid number of bytes: " + writeBytes);
                            if (writeBytes < 0) {
                                this.keepAlive = false;
                                WebRtcAudioTrack.this.reportWebRtcAudioTrackError("AudioTrack.write failed: " + writeBytes);
                            }
                        }
                        WebRtcAudioTrack.this.byteBuffer.rewind();
                        this.writtenFrames += writeBytes / channelCount;
                        long playbackHeadPosition = ((this.writtenFrames - WebRtcAudioTrack.this.audioTrack.getPlaybackHeadPosition()) * 1000) / sampleRate;
                        WebRtcAudioTrack.this.byteBuffer.rewind();
                        this.targetTimeNs += 10000000;
                        nanoTime = this.targetTimeNs - System.nanoTime();
                    } catch (Throwable unused) {
                        this.keepAlive = false;
                    }
                    if (nanoTime > 0) {
                        try {
                            Thread.sleep(nanoTime / 1000000, (int) (nanoTime % 1000000));
                        } catch (InterruptedException e) {
                            FileLog.e(e);
                        }
                    }
                }
            }
            if (WebRtcAudioTrack.this.audioTrack != null) {
                Logging.d("WebRtcAudioTrack", "Calling AudioTrack.stop...");
                try {
                    WebRtcAudioTrack.this.audioTrack.stop();
                    Logging.d("WebRtcAudioTrack", "AudioTrack.stop is done.");
                } catch (Exception e2) {
                    Logging.e("WebRtcAudioTrack", "AudioTrack.stop failed: " + e2.getMessage());
                }
            }
        }

        public void stopThread() {
            Logging.d("WebRtcAudioTrack", "stopThread");
            this.keepAlive = false;
        }
    }

    public interface ErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    @Deprecated
    public interface WebRtcAudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(String str);
    }

    static {
        int defaultUsageAttribute = getDefaultUsageAttribute();
        DEFAULT_USAGE = defaultUsageAttribute;
        usageAttribute = defaultUsageAttribute;
        streamType = 0;
    }

    WebRtcAudioTrack(long j) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        threadChecker.checkIsOnValidThread();
        Logging.d("WebRtcAudioTrack", "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioTrack = j;
        this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 4 : 12;
    }

    private static AudioTrack createAudioTrackOnLollipopOrHigher(int i, int i2, int i3) {
        AudioAttributes.Builder usage;
        AudioAttributes.Builder contentType;
        AudioAttributes build;
        AudioFormat.Builder encoding;
        AudioFormat.Builder sampleRate;
        AudioFormat.Builder channelMask;
        AudioFormat build2;
        Logging.d("WebRtcAudioTrack", "createAudioTrackOnLollipopOrHigher");
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(streamType);
        Logging.d("WebRtcAudioTrack", "nativeOutputSampleRate: " + nativeOutputSampleRate);
        if (i != nativeOutputSampleRate) {
            Logging.w("WebRtcAudioTrack", "Unable to use fast mode since requested sample rate is not native");
        }
        if (usageAttribute != DEFAULT_USAGE) {
            Logging.w("WebRtcAudioTrack", "A non default usage attribute is used: " + usageAttribute);
        }
        usage = new AudioAttributes.Builder().setUsage(usageAttribute);
        contentType = usage.setContentType(1);
        build = contentType.build();
        encoding = new AudioFormat.Builder().setEncoding(2);
        sampleRate = encoding.setSampleRate(i);
        channelMask = sampleRate.setChannelMask(i2);
        build2 = channelMask.build();
        return new AudioTrack(build, build2, i3, 1, 0);
    }

    private static AudioTrack createAudioTrackOnLowerThanLollipop(int i, int i2, int i3) {
        return new AudioTrack(streamType, i, i2, 2, i3, 1);
    }

    private int getBufferSizeInFrames() {
        int bufferSizeInFrames;
        if (Build.VERSION.SDK_INT < 23) {
            return -1;
        }
        bufferSizeInFrames = this.audioTrack.getBufferSizeInFrames();
        return bufferSizeInFrames;
    }

    private static int getDefaultUsageAttribute() {
        return Build.VERSION.SDK_INT >= 21 ? 2 : 0;
    }

    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.d("WebRtcAudioTrack", "getStreamMaxVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamMaxVolume(streamType);
    }

    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.d("WebRtcAudioTrack", "getStreamVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamVolume(streamType);
    }

    private int initPlayout(int i, int i2, double d) {
        this.threadChecker.checkIsOnValidThread();
        Logging.d("WebRtcAudioTrack", "initPlayout(sampleRate=" + i + ", channels=" + i2 + ", bufferSizeFactor=" + d + ")");
        this.byteBuffer = ByteBuffer.allocateDirect(i2 * 2 * (i / 100));
        StringBuilder sb = new StringBuilder();
        sb.append("byteBuffer.capacity: ");
        sb.append(this.byteBuffer.capacity());
        Logging.d("WebRtcAudioTrack", sb.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
        int channelCountToConfiguration = channelCountToConfiguration(i2);
        double minBufferSize = AudioTrack.getMinBufferSize(i, channelCountToConfiguration, 2);
        Double.isNaN(minBufferSize);
        int i3 = (int) (minBufferSize * d);
        Logging.d("WebRtcAudioTrack", "minBufferSizeInBytes: " + i3);
        if (i3 < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return -1;
        }
        if (this.audioTrack != null) {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            return -1;
        }
        try {
            AudioTrack createAudioTrackOnLollipopOrHigher = Build.VERSION.SDK_INT >= 21 ? createAudioTrackOnLollipopOrHigher(i, channelCountToConfiguration, i3) : createAudioTrackOnLowerThanLollipop(i, channelCountToConfiguration, i3);
            this.audioTrack = createAudioTrackOnLollipopOrHigher;
            if (createAudioTrackOnLollipopOrHigher == null || createAudioTrackOnLollipopOrHigher.getState() != 1) {
                reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                releaseAudioResources();
                return -1;
            }
            logMainParameters();
            logMainParametersExtended();
            return i3;
        } catch (IllegalArgumentException e) {
            reportWebRtcAudioTrackInitError(e.getMessage());
            releaseAudioResources();
            return -1;
        }
    }

    public static boolean isSpeakerMuted() {
        return speakerMute;
    }

    private boolean isVolumeFixed() {
        boolean isVolumeFixed;
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        isVolumeFixed = this.audioManager.isVolumeFixed();
        return isVolumeFixed;
    }

    private void logBufferCapacityInFrames() {
        int bufferCapacityInFrames;
        if (Build.VERSION.SDK_INT >= 24) {
            StringBuilder sb = new StringBuilder();
            sb.append("AudioTrack: buffer capacity in frames: ");
            bufferCapacityInFrames = this.audioTrack.getBufferCapacityInFrames();
            sb.append(bufferCapacityInFrames);
            Logging.d("WebRtcAudioTrack", sb.toString());
        }
    }

    private void logBufferSizeInFrames() {
        int bufferSizeInFrames;
        if (Build.VERSION.SDK_INT >= 23) {
            StringBuilder sb = new StringBuilder();
            sb.append("AudioTrack: buffer size in frames: ");
            bufferSizeInFrames = this.audioTrack.getBufferSizeInFrames();
            sb.append(bufferSizeInFrames);
            Logging.d("WebRtcAudioTrack", sb.toString());
        }
    }

    private void logMainParameters() {
        Logging.d("WebRtcAudioTrack", "AudioTrack: session ID: " + this.audioTrack.getAudioSessionId() + ", channels: " + this.audioTrack.getChannelCount() + ", sample rate: " + this.audioTrack.getSampleRate() + ", max gain: " + AudioTrack.getMaxVolume());
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    private void logUnderrunCount() {
        int underrunCount;
        if (Build.VERSION.SDK_INT >= 24) {
            StringBuilder sb = new StringBuilder();
            sb.append("underrun count: ");
            underrunCount = this.audioTrack.getUnderrunCount();
            sb.append(underrunCount);
            Logging.d("WebRtcAudioTrack", sb.toString());
        }
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    public native void nativeGetPlayoutData(int i, long j);

    private void releaseAudioResources() {
        Logging.d("WebRtcAudioTrack", "releaseAudioResources");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            try {
                audioTrack.release();
            } catch (Throwable th) {
                FileLog.e(th);
            }
            this.audioTrack = null;
        }
    }

    public void reportWebRtcAudioTrackError(String str) {
        Logging.e("WebRtcAudioTrack", "Run-time playback error: " + str);
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        Logging.e("WebRtcAudioTrack", "Init playout error: " + str);
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        Logging.e("WebRtcAudioTrack", "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackStartError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    public static synchronized void setAudioStreamType(int i) {
        synchronized (WebRtcAudioTrack.class) {
            streamType = i;
        }
    }

    public static synchronized void setAudioTrackUsageAttribute(int i) {
        synchronized (WebRtcAudioTrack.class) {
            Logging.w("WebRtcAudioTrack", "Default usage attribute is changed from: " + DEFAULT_USAGE + " to " + i);
            usageAttribute = i;
        }
    }

    public static void setErrorCallback(ErrorCallback errorCallback2) {
        Logging.d("WebRtcAudioTrack", "Set extended error callback");
        errorCallback = errorCallback2;
    }

    @Deprecated
    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        Logging.d("WebRtcAudioTrack", "Set error callback (deprecated");
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }

    public static void setSpeakerMute(boolean z) {
        Logging.w("WebRtcAudioTrack", "setSpeakerMute(" + z + ")");
        speakerMute = z;
    }

    private boolean setStreamVolume(int i) {
        this.threadChecker.checkIsOnValidThread();
        Logging.d("WebRtcAudioTrack", "setStreamVolume(" + i + ")");
        assertTrue(this.audioManager != null);
        if (isVolumeFixed()) {
            Logging.e("WebRtcAudioTrack", "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(streamType, i, 0);
        return true;
    }

    private boolean startPlayout() {
        this.threadChecker.checkIsOnValidThread();
        Logging.d("WebRtcAudioTrack", "startPlayout");
        assertTrue(this.audioTrack != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioTrack.play();
        } catch (IllegalStateException e) {
            reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, "AudioTrack.play failed: " + e.getMessage());
        }
        if (this.audioTrack.getPlayState() == 3) {
            AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        }
        reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState());
        releaseAudioResources();
        return false;
    }

    private boolean stopPlayout() {
        try {
            this.threadChecker.checkIsOnValidThread();
            Logging.d("WebRtcAudioTrack", "stopPlayout");
            assertTrue(this.audioThread != null);
            logUnderrunCount();
            this.audioThread.stopThread();
            Logging.d("WebRtcAudioTrack", "Stopping the AudioTrackThread...");
            this.audioThread.interrupt();
            if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
                Logging.e("WebRtcAudioTrack", "Join of AudioTrackThread timed out.");
                WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
            }
            Logging.d("WebRtcAudioTrack", "AudioTrackThread has now been stopped.");
        } finally {
            try {
                releaseAudioResources();
                return true;
            } finally {
            }
        }
        try {
            releaseAudioResources();
        } catch (Throwable th) {
            FileLog.e(th);
        }
        return true;
    }
}
