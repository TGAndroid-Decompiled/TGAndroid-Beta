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

    public class AudioTrackThread extends Thread {
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

        private int writeBytes(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, boolean z10) {
            if (audioTrack == null) {
                return 0;
            }
            return audioTrack.write(byteBuffer, i10, !z10 ? 1 : 0);
        }

        @Override
        public void run() {
            Process.setThreadPriority(-19);
            Logging.d("WebRtcAudioTrack", "AudioTrackThread" + WebRtcAudioUtils.getThreadInfo());
            WebRtcAudioTrack.assertTrue(WebRtcAudioTrack.this.audioTrack.getPlayState() == 3);
            int iCapacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            WebRtcAudioTrack.this.audioTrack.getChannelCount();
            WebRtcAudioTrack.this.audioTrack.getSampleRate();
            this.targetTimeNs = System.nanoTime();
            boolean z10 = false;
            while (this.keepAlive && WebRtcAudioTrack.this.audioTrack != null) {
                try {
                    WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                    webRtcAudioTrack.nativeGetPlayoutData(iCapacity, webRtcAudioTrack.nativeAudioTrack);
                    WebRtcAudioTrack.assertTrue(iCapacity <= WebRtcAudioTrack.this.byteBuffer.remaining());
                    if (WebRtcAudioTrack.speakerMute) {
                        WebRtcAudioTrack.this.byteBuffer.clear();
                        WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                        WebRtcAudioTrack.this.byteBuffer.position(0);
                    }
                    int iWriteBytes = writeBytes(WebRtcAudioTrack.this.audioTrack, WebRtcAudioTrack.this.byteBuffer, iCapacity, z10);
                    if (iWriteBytes != iCapacity) {
                        Logging.e("WebRtcAudioTrack", "AudioTrack.write played invalid number of bytes: " + iWriteBytes);
                        if (iWriteBytes < 0) {
                            this.keepAlive = false;
                            WebRtcAudioTrack.this.reportWebRtcAudioTrackError("AudioTrack.write failed: " + iWriteBytes);
                        }
                    }
                    WebRtcAudioTrack.this.byteBuffer.rewind();
                    z10 = !z10;
                    WebRtcAudioTrack.this.byteBuffer.rewind();
                    this.targetTimeNs += 10000000;
                    long jNanoTime = this.targetTimeNs - System.nanoTime();
                    if (jNanoTime > 0) {
                        try {
                            Thread.sleep(jNanoTime / 1000000, (int) (jNanoTime % 1000000));
                        } catch (InterruptedException e9) {
                            FileLog.e(e9);
                        }
                    } else {
                        this.targetTimeNs = System.nanoTime();
                    }
                } catch (Throwable unused) {
                    this.keepAlive = false;
                }
            }
            if (WebRtcAudioTrack.this.audioTrack != null) {
                Logging.d("WebRtcAudioTrack", "Calling AudioTrack.stop...");
                try {
                    WebRtcAudioTrack.this.audioTrack.stop();
                    Logging.d("WebRtcAudioTrack", "AudioTrack.stop is done.");
                } catch (Exception e10) {
                    Logging.e("WebRtcAudioTrack", "AudioTrack.stop failed: " + e10.getMessage());
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

    public WebRtcAudioTrack(long j10) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        threadChecker.checkIsOnValidThread();
        Logging.d("WebRtcAudioTrack", "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioTrack = j10;
        this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
    }

    public static void assertTrue(boolean z10) {
        if (!z10) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i10) {
        return i10 == 1 ? 4 : 12;
    }

    private static AudioTrack createAudioTrackOnLollipopOrHigher(int i10, int i11, int i12) {
        Logging.d("WebRtcAudioTrack", "createAudioTrackOnLollipopOrHigher");
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(streamType);
        Logging.d("WebRtcAudioTrack", "nativeOutputSampleRate: " + nativeOutputSampleRate);
        if (i10 != nativeOutputSampleRate) {
            Logging.w("WebRtcAudioTrack", "Unable to use fast mode since requested sample rate is not native");
        }
        if (usageAttribute != DEFAULT_USAGE) {
            Logging.w("WebRtcAudioTrack", "A non default usage attribute is used: " + usageAttribute);
        }
        return new AudioTrack(new AudioAttributes.Builder().setUsage(usageAttribute).setContentType(1).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i10).setChannelMask(i11).build(), i12, 1, 0);
    }

    private static AudioTrack createAudioTrackOnLowerThanLollipop(int i10, int i11, int i12) {
        return new AudioTrack(streamType, i10, i11, 2, i12, 1);
    }

    private int getBufferSizeInFrames() {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.audioTrack.getBufferSizeInFrames();
        }
        return -1;
    }

    private static int getDefaultUsageAttribute() {
        return 2;
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

    private int initPlayout(int i10, int i11, double d) {
        this.threadChecker.checkIsOnValidThread();
        Logging.d("WebRtcAudioTrack", "initPlayout(sampleRate=" + i10 + ", channels=" + i11 + ", bufferSizeFactor=" + d + ")");
        this.byteBuffer = ByteBuffer.allocateDirect((i10 / 100) * i11 * 2);
        StringBuilder sb2 = new StringBuilder("byteBuffer.capacity: ");
        sb2.append(this.byteBuffer.capacity());
        Logging.d("WebRtcAudioTrack", sb2.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
        int iChannelCountToConfiguration = channelCountToConfiguration(i11);
        int minBufferSize = (int) (((double) AudioTrack.getMinBufferSize(i10, iChannelCountToConfiguration, 2)) * d);
        Logging.d("WebRtcAudioTrack", "minBufferSizeInBytes: " + minBufferSize);
        if (minBufferSize < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return -1;
        }
        if (this.audioTrack != null) {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            return -1;
        }
        try {
            AudioTrack audioTrackCreateAudioTrackOnLollipopOrHigher = createAudioTrackOnLollipopOrHigher(i10, iChannelCountToConfiguration, minBufferSize);
            this.audioTrack = audioTrackCreateAudioTrackOnLollipopOrHigher;
            if (audioTrackCreateAudioTrackOnLollipopOrHigher == null || audioTrackCreateAudioTrackOnLollipopOrHigher.getState() != 1) {
                reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                releaseAudioResources();
                return -1;
            }
            logMainParameters();
            logMainParametersExtended();
            return minBufferSize;
        } catch (IllegalArgumentException e9) {
            reportWebRtcAudioTrackInitError(e9.getMessage());
            releaseAudioResources();
            return -1;
        }
    }

    public static boolean isSpeakerMuted() {
        return speakerMute;
    }

    private boolean isVolumeFixed() {
        return this.audioManager.isVolumeFixed();
    }

    private void logBufferCapacityInFrames() {
        if (Build.VERSION.SDK_INT >= 24) {
            Logging.d("WebRtcAudioTrack", "AudioTrack: buffer capacity in frames: " + this.audioTrack.getBufferCapacityInFrames());
        }
    }

    private void logBufferSizeInFrames() {
        if (Build.VERSION.SDK_INT >= 23) {
            Logging.d("WebRtcAudioTrack", "AudioTrack: buffer size in frames: " + this.audioTrack.getBufferSizeInFrames());
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
        if (Build.VERSION.SDK_INT >= 24) {
            Logging.d("WebRtcAudioTrack", "underrun count: " + this.audioTrack.getUnderrunCount());
        }
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j10);

    public native void nativeGetPlayoutData(int i10, long j10);

    private void releaseAudioResources() {
        Logging.e("WebRtcAudioTrack", "releaseAudioResources", new Exception());
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            this.audioTrack = null;
            try {
                audioTrack.release();
            } catch (Throwable th) {
                FileLog.e(th);
            }
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

    public static synchronized void setAudioStreamType(int i10) {
        streamType = i10;
    }

    public static synchronized void setAudioTrackUsageAttribute(int i10) {
        Logging.w("WebRtcAudioTrack", "Default usage attribute is changed from: " + DEFAULT_USAGE + " to " + i10);
        usageAttribute = i10;
    }

    @Deprecated
    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        Logging.d("WebRtcAudioTrack", "Set error callback (deprecated");
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }

    public static void setSpeakerMute(boolean z10) {
        Logging.w("WebRtcAudioTrack", "setSpeakerMute(" + z10 + ")");
        speakerMute = z10;
    }

    private boolean setStreamVolume(int i10) {
        this.threadChecker.checkIsOnValidThread();
        Logging.d("WebRtcAudioTrack", "setStreamVolume(" + i10 + ")");
        assertTrue(this.audioManager != null);
        if (isVolumeFixed()) {
            Logging.e("WebRtcAudioTrack", "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(streamType, i10, 0);
        return true;
    }

    private boolean startPlayout() {
        this.threadChecker.checkIsOnValidThread();
        Logging.d("WebRtcAudioTrack", "startPlayout");
        assertTrue(this.audioTrack != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() == 3) {
                AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
                this.audioThread = audioTrackThread;
                audioTrackThread.start();
                return true;
            }
            reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState());
            releaseAudioResources();
            return false;
        } catch (IllegalStateException e9) {
            reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, "AudioTrack.play failed: " + e9.getMessage());
            releaseAudioResources();
            return false;
        }
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
        } catch (Throwable th) {
            try {
                FileLog.e(th);
            } catch (Throwable th2) {
                this.audioThread = null;
                throw th2;
            }
        }
        this.audioThread = null;
        try {
            releaseAudioResources();
        } catch (Throwable th3) {
            FileLog.e(th3);
        }
        return true;
    }

    public static void setErrorCallback(ErrorCallback errorCallback2) {
        Logging.d("WebRtcAudioTrack", "Set extended error callback");
        errorCallback = errorCallback2;
    }
}
