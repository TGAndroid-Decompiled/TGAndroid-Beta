package org.webrtc.voiceengine;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import java.nio.ByteBuffer;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;
import org.webrtc.MediaStreamTrack;
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

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 4 : 12;
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    public native void nativeGetPlayoutData(int i, long j);

    static {
        int defaultUsageAttribute = getDefaultUsageAttribute();
        DEFAULT_USAGE = defaultUsageAttribute;
        usageAttribute = defaultUsageAttribute;
        streamType = 0;
    }

    public static synchronized void setAudioTrackUsageAttribute(int i) {
        synchronized (WebRtcAudioTrack.class) {
            Logging.m5w(TAG, "Default usage attribute is changed from: " + DEFAULT_USAGE + " to " + i);
            usageAttribute = i;
        }
    }

    public static synchronized void setAudioStreamType(int i) {
        synchronized (WebRtcAudioTrack.class) {
            streamType = i;
        }
    }

    private static int getDefaultUsageAttribute() {
        return Build.VERSION.SDK_INT >= 21 ? 2 : 0;
    }

    @Deprecated
    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        Logging.m9d(TAG, "Set error callback (deprecated");
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }

    public static void setErrorCallback(ErrorCallback errorCallback2) {
        Logging.m9d(TAG, "Set extended error callback");
        errorCallback = errorCallback2;
    }

    private class AudioTrackThread extends Thread {
        private volatile boolean keepAlive;

        public AudioTrackThread(String str) {
            super(str);
            WebRtcAudioTrack.this = r1;
            this.keepAlive = true;
        }

        @Override
        public void run() {
            Process.setThreadPriority(-19);
            Logging.m9d(WebRtcAudioTrack.TAG, "AudioTrackThread" + WebRtcAudioUtils.getThreadInfo());
            WebRtcAudioTrack.assertTrue(WebRtcAudioTrack.this.audioTrack.getPlayState() == 3);
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
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
                        Logging.m8e(WebRtcAudioTrack.TAG, "AudioTrack.write played invalid number of bytes: " + writeBytes);
                        if (writeBytes < 0) {
                            this.keepAlive = false;
                            WebRtcAudioTrack webRtcAudioTrack2 = WebRtcAudioTrack.this;
                            webRtcAudioTrack2.reportWebRtcAudioTrackError("AudioTrack.write failed: " + writeBytes);
                        }
                    }
                    WebRtcAudioTrack.this.byteBuffer.rewind();
                } catch (Throwable unused) {
                    this.keepAlive = false;
                }
            }
            if (WebRtcAudioTrack.this.audioTrack != null) {
                Logging.m9d(WebRtcAudioTrack.TAG, "Calling AudioTrack.stop...");
                try {
                    WebRtcAudioTrack.this.audioTrack.stop();
                    Logging.m9d(WebRtcAudioTrack.TAG, "AudioTrack.stop is done.");
                } catch (Exception e) {
                    Logging.m8e(WebRtcAudioTrack.TAG, "AudioTrack.stop failed: " + e.getMessage());
                }
            }
        }

        private int writeBytes(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                return audioTrack.write(byteBuffer, i, 0);
            }
            return audioTrack.write(byteBuffer.array(), byteBuffer.arrayOffset(), i);
        }

        public void stopThread() {
            Logging.m9d(WebRtcAudioTrack.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    WebRtcAudioTrack(long j) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        threadChecker.checkIsOnValidThread();
        Logging.m9d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioTrack = j;
        this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }

    private int initPlayout(int i, int i2, double d) {
        this.threadChecker.checkIsOnValidThread();
        Logging.m9d(TAG, "initPlayout(sampleRate=" + i + ", channels=" + i2 + ", bufferSizeFactor=" + d + ")");
        this.byteBuffer = ByteBuffer.allocateDirect(i2 * 2 * (i / 100));
        StringBuilder sb = new StringBuilder();
        sb.append("byteBuffer.capacity: ");
        sb.append(this.byteBuffer.capacity());
        Logging.m9d(TAG, sb.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
        int channelCountToConfiguration = channelCountToConfiguration(i2);
        double minBufferSize = AudioTrack.getMinBufferSize(i, channelCountToConfiguration, 2);
        Double.isNaN(minBufferSize);
        int i3 = (int) (minBufferSize * d);
        Logging.m9d(TAG, "minBufferSizeInBytes: " + i3);
        if (i3 < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return -1;
        } else if (this.audioTrack != null) {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            return -1;
        } else {
            try {
                if (Build.VERSION.SDK_INT >= 21) {
                    this.audioTrack = createAudioTrackOnLollipopOrHigher(i, channelCountToConfiguration, i3);
                } else {
                    this.audioTrack = createAudioTrackOnLowerThanLollipop(i, channelCountToConfiguration, i3);
                }
                AudioTrack audioTrack = this.audioTrack;
                if (audioTrack == null || audioTrack.getState() != 1) {
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
    }

    private boolean startPlayout() {
        this.threadChecker.checkIsOnValidThread();
        Logging.m9d(TAG, "startPlayout");
        assertTrue(this.audioTrack != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                AudioTrackStartErrorCode audioTrackStartErrorCode = AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH;
                reportWebRtcAudioTrackStartError(audioTrackStartErrorCode, "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState());
                releaseAudioResources();
                return false;
            }
            AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        } catch (IllegalStateException e) {
            AudioTrackStartErrorCode audioTrackStartErrorCode2 = AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION;
            reportWebRtcAudioTrackStartError(audioTrackStartErrorCode2, "AudioTrack.play failed: " + e.getMessage());
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopPlayout() {
        this.threadChecker.checkIsOnValidThread();
        Logging.m9d(TAG, "stopPlayout");
        assertTrue(this.audioThread != null);
        logUnderrunCount();
        this.audioThread.stopThread();
        Logging.m9d(TAG, "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS)) {
            Logging.m8e(TAG, "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState(TAG);
        }
        Logging.m9d(TAG, "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        releaseAudioResources();
        return true;
    }

    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.m9d(TAG, "getStreamMaxVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamMaxVolume(streamType);
    }

    private boolean setStreamVolume(int i) {
        this.threadChecker.checkIsOnValidThread();
        Logging.m9d(TAG, "setStreamVolume(" + i + ")");
        assertTrue(this.audioManager != null);
        if (isVolumeFixed()) {
            Logging.m8e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(streamType, i, 0);
        return true;
    }

    private boolean isVolumeFixed() {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return this.audioManager.isVolumeFixed();
    }

    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.m9d(TAG, "getStreamVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamVolume(streamType);
    }

    private void logMainParameters() {
        Logging.m9d(TAG, "AudioTrack: session ID: " + this.audioTrack.getAudioSessionId() + ", channels: " + this.audioTrack.getChannelCount() + ", sample rate: " + this.audioTrack.getSampleRate() + ", max gain: " + AudioTrack.getMaxVolume());
    }

    @TargetApi(21)
    private static AudioTrack createAudioTrackOnLollipopOrHigher(int i, int i2, int i3) {
        Logging.m9d(TAG, "createAudioTrackOnLollipopOrHigher");
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(streamType);
        Logging.m9d(TAG, "nativeOutputSampleRate: " + nativeOutputSampleRate);
        if (i != nativeOutputSampleRate) {
            Logging.m5w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
        if (usageAttribute != DEFAULT_USAGE) {
            Logging.m5w(TAG, "A non default usage attribute is used: " + usageAttribute);
        }
        return new AudioTrack(new AudioAttributes.Builder().setUsage(usageAttribute).setContentType(1).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build(), i3, 1, 0);
    }

    private static AudioTrack createAudioTrackOnLowerThanLollipop(int i, int i2, int i3) {
        return new AudioTrack(streamType, i, i2, 2, i3, 1);
    }

    private void logBufferSizeInFrames() {
        if (Build.VERSION.SDK_INT >= 23) {
            Logging.m9d(TAG, "AudioTrack: buffer size in frames: " + this.audioTrack.getBufferSizeInFrames());
        }
    }

    private int getBufferSizeInFrames() {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.audioTrack.getBufferSizeInFrames();
        }
        return -1;
    }

    private void logBufferCapacityInFrames() {
        if (Build.VERSION.SDK_INT >= 24) {
            Logging.m9d(TAG, "AudioTrack: buffer capacity in frames: " + this.audioTrack.getBufferCapacityInFrames());
        }
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    private void logUnderrunCount() {
        if (Build.VERSION.SDK_INT >= 24) {
            Logging.m9d(TAG, "underrun count: " + this.audioTrack.getUnderrunCount());
        }
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static void setSpeakerMute(boolean z) {
        Logging.m5w(TAG, "setSpeakerMute(" + z + ")");
        speakerMute = z;
    }

    public static boolean isSpeakerMuted() {
        return speakerMute;
    }

    private void releaseAudioResources() {
        Logging.m9d(TAG, "releaseAudioResources");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        Logging.m8e(TAG, "Init playout error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
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
        Logging.m8e(TAG, "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackStartError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    public void reportWebRtcAudioTrackError(String str) {
        Logging.m8e(TAG, "Run-time playback error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackError(str);
        }
    }
}
