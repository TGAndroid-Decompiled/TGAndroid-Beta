package org.webrtc.audio;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import java.nio.ByteBuffer;
import org.webrtc.CalledByNative;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.audio.JavaAudioDeviceModule;

public class WebRtcAudioTrack {
    private static final int AUDIO_TRACK_START = 0;
    private static final int AUDIO_TRACK_STOP = 1;
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int DEFAULT_USAGE = getDefaultUsageAttribute();
    private static final String TAG = "WebRtcAudioTrackExternal";
    private final AudioAttributes audioAttributes;
    private final AudioManager audioManager;
    private AudioTrackThread audioThread;
    private AudioTrack audioTrack;
    private ByteBuffer byteBuffer;
    private final Context context;
    private byte[] emptyBytes;
    private final JavaAudioDeviceModule.AudioTrackErrorCallback errorCallback;
    private int initialBufferSizeInFrames;
    private long nativeAudioTrack;
    private volatile boolean speakerMute;
    private final JavaAudioDeviceModule.AudioTrackStateCallback stateCallback;
    private final ThreadUtils.ThreadChecker threadChecker;
    private boolean useLowLatency;
    private final VolumeLogger volumeLogger;

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 4 : 12;
    }

    private static native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer);

    public static native void nativeGetPlayoutData(long j, int i);

    private static int getDefaultUsageAttribute() {
        return Build.VERSION.SDK_INT >= 21 ? 2 : 0;
    }

    private class AudioTrackThread extends Thread {
        private LowLatencyAudioBufferManager bufferManager;
        private volatile boolean keepAlive;

        public AudioTrackThread(String str) {
            super(str);
            WebRtcAudioTrack.this = r1;
            this.keepAlive = true;
            this.bufferManager = new LowLatencyAudioBufferManager();
        }

        @Override
        public void run() {
            Process.setThreadPriority(-19);
            Logging.m9d(WebRtcAudioTrack.TAG, "AudioTrackThread" + WebRtcAudioUtils.getThreadInfo());
            WebRtcAudioTrack.assertTrue(WebRtcAudioTrack.this.audioTrack.getPlayState() == 3);
            WebRtcAudioTrack.this.doAudioTrackStateCallback(0);
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                WebRtcAudioTrack.nativeGetPlayoutData(WebRtcAudioTrack.this.nativeAudioTrack, capacity);
                WebRtcAudioTrack.assertTrue(capacity <= WebRtcAudioTrack.this.byteBuffer.remaining());
                if (WebRtcAudioTrack.this.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                    WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                int writeBytes = writeBytes(WebRtcAudioTrack.this.audioTrack, WebRtcAudioTrack.this.byteBuffer, capacity);
                if (writeBytes != capacity) {
                    Logging.m8e(WebRtcAudioTrack.TAG, "AudioTrack.write played invalid number of bytes: " + writeBytes);
                    if (writeBytes < 0) {
                        this.keepAlive = false;
                        WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                        webRtcAudioTrack.reportWebRtcAudioTrackError("AudioTrack.write failed: " + writeBytes);
                    }
                }
                if (WebRtcAudioTrack.this.useLowLatency) {
                    this.bufferManager.maybeAdjustBufferSize(WebRtcAudioTrack.this.audioTrack);
                }
                WebRtcAudioTrack.this.byteBuffer.rewind();
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

    @CalledByNative
    WebRtcAudioTrack(Context context, AudioManager audioManager) {
        this(context, audioManager, null, null, null, false);
    }

    public WebRtcAudioTrack(Context context, AudioManager audioManager, AudioAttributes audioAttributes, JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback, JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback, boolean z) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        threadChecker.detachThread();
        this.context = context;
        this.audioManager = audioManager;
        this.audioAttributes = audioAttributes;
        this.errorCallback = audioTrackErrorCallback;
        this.stateCallback = audioTrackStateCallback;
        this.volumeLogger = new VolumeLogger(audioManager);
        this.useLowLatency = z;
        Logging.m9d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
    }

    @CalledByNative
    public void setNativeAudioTrack(long j) {
        this.nativeAudioTrack = j;
    }

    @CalledByNative
    private int initPlayout(int i, int i2, double d) {
        this.threadChecker.checkIsOnValidThread();
        Logging.m9d(TAG, "initPlayout(sampleRate=" + i + ", channels=" + i2 + ", bufferSizeFactor=" + d + ")");
        this.byteBuffer = ByteBuffer.allocateDirect(i2 * 2 * (i / 100));
        StringBuilder sb = new StringBuilder();
        sb.append("byteBuffer.capacity: ");
        sb.append(this.byteBuffer.capacity());
        Logging.m9d(TAG, sb.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioTrack, this.byteBuffer);
        int channelCountToConfiguration = channelCountToConfiguration(i2);
        double minBufferSize = AudioTrack.getMinBufferSize(i, channelCountToConfiguration, 2);
        Double.isNaN(minBufferSize);
        int i3 = (int) (minBufferSize * d);
        Logging.m9d(TAG, "minBufferSizeInBytes: " + i3);
        if (i3 < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return -1;
        }
        if (d > 1.0d) {
            this.useLowLatency = false;
        }
        if (this.audioTrack != null) {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            return -1;
        }
        try {
            if (this.useLowLatency && Build.VERSION.SDK_INT >= 26) {
                this.audioTrack = createAudioTrackOnOreoOrHigher(i, channelCountToConfiguration, i3, this.audioAttributes);
            } else if (Build.VERSION.SDK_INT >= 21) {
                this.audioTrack = createAudioTrackOnLollipopOrHigher(i, channelCountToConfiguration, i3, this.audioAttributes);
            } else {
                this.audioTrack = createAudioTrackOnLowerThanLollipop(i, channelCountToConfiguration, i3);
            }
            AudioTrack audioTrack = this.audioTrack;
            if (audioTrack == null || audioTrack.getState() != 1) {
                reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                releaseAudioResources();
                return -1;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                this.initialBufferSizeInFrames = this.audioTrack.getBufferSizeInFrames();
            } else {
                this.initialBufferSizeInFrames = -1;
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

    @CalledByNative
    private boolean startPlayout() {
        this.threadChecker.checkIsOnValidThread();
        this.volumeLogger.start();
        Logging.m9d(TAG, "startPlayout");
        assertTrue(this.audioTrack != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode = JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH;
                reportWebRtcAudioTrackStartError(audioTrackStartErrorCode, "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState());
                releaseAudioResources();
                return false;
            }
            AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        } catch (IllegalStateException e) {
            JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode2 = JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION;
            reportWebRtcAudioTrackStartError(audioTrackStartErrorCode2, "AudioTrack.play failed: " + e.getMessage());
            releaseAudioResources();
            return false;
        }
    }

    @CalledByNative
    private boolean stopPlayout() {
        this.threadChecker.checkIsOnValidThread();
        this.volumeLogger.stop();
        Logging.m9d(TAG, "stopPlayout");
        assertTrue(this.audioThread != null);
        logUnderrunCount();
        this.audioThread.stopThread();
        Logging.m9d(TAG, "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS)) {
            Logging.m8e(TAG, "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        }
        Logging.m9d(TAG, "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        if (this.audioTrack != null) {
            Logging.m9d(TAG, "Calling AudioTrack.stop...");
            try {
                this.audioTrack.stop();
                Logging.m9d(TAG, "AudioTrack.stop is done.");
                doAudioTrackStateCallback(1);
            } catch (IllegalStateException e) {
                Logging.m8e(TAG, "AudioTrack.stop failed: " + e.getMessage());
            }
        }
        releaseAudioResources();
        return true;
    }

    @CalledByNative
    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.m9d(TAG, "getStreamMaxVolume");
        return this.audioManager.getStreamMaxVolume(0);
    }

    @CalledByNative
    private boolean setStreamVolume(int i) {
        this.threadChecker.checkIsOnValidThread();
        Logging.m9d(TAG, "setStreamVolume(" + i + ")");
        if (isVolumeFixed()) {
            Logging.m8e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i, 0);
        return true;
    }

    private boolean isVolumeFixed() {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return this.audioManager.isVolumeFixed();
    }

    @CalledByNative
    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.m9d(TAG, "getStreamVolume");
        return this.audioManager.getStreamVolume(0);
    }

    @CalledByNative
    private int GetPlayoutUnderrunCount() {
        if (Build.VERSION.SDK_INT >= 24) {
            AudioTrack audioTrack = this.audioTrack;
            if (audioTrack != null) {
                return audioTrack.getUnderrunCount();
            }
            return -1;
        }
        return -2;
    }

    private void logMainParameters() {
        Logging.m9d(TAG, "AudioTrack: session ID: " + this.audioTrack.getAudioSessionId() + ", channels: " + this.audioTrack.getChannelCount() + ", sample rate: " + this.audioTrack.getSampleRate() + ", max gain: " + AudioTrack.getMaxVolume());
    }

    private static void logNativeOutputSampleRate(int i) {
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        Logging.m9d(TAG, "nativeOutputSampleRate: " + nativeOutputSampleRate);
        if (i != nativeOutputSampleRate) {
            Logging.m5w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
    }

    private static AudioAttributes getAudioAttributes(AudioAttributes audioAttributes) {
        AudioAttributes.Builder contentType = new AudioAttributes.Builder().setUsage(DEFAULT_USAGE).setContentType(1);
        if (audioAttributes != null) {
            if (audioAttributes.getUsage() != 0) {
                contentType.setUsage(audioAttributes.getUsage());
            }
            if (audioAttributes.getContentType() != 0) {
                contentType.setContentType(audioAttributes.getContentType());
            }
            contentType.setFlags(audioAttributes.getFlags());
            if (Build.VERSION.SDK_INT >= 29) {
                contentType = applyAttributesOnQOrHigher(contentType, audioAttributes);
            }
        }
        return contentType.build();
    }

    @TargetApi(21)
    private static AudioTrack createAudioTrackOnLollipopOrHigher(int i, int i2, int i3, AudioAttributes audioAttributes) {
        Logging.m9d(TAG, "createAudioTrackOnLollipopOrHigher");
        logNativeOutputSampleRate(i);
        return new AudioTrack(getAudioAttributes(audioAttributes), new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build(), i3, 1, 0);
    }

    @TargetApi(26)
    private static AudioTrack createAudioTrackOnOreoOrHigher(int i, int i2, int i3, AudioAttributes audioAttributes) {
        Logging.m9d(TAG, "createAudioTrackOnOreoOrHigher");
        logNativeOutputSampleRate(i);
        return new AudioTrack.Builder().setAudioAttributes(getAudioAttributes(audioAttributes)).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build()).setBufferSizeInBytes(i3).setPerformanceMode(1).setTransferMode(1).setSessionId(0).build();
    }

    @TargetApi(29)
    private static AudioAttributes.Builder applyAttributesOnQOrHigher(AudioAttributes.Builder builder, AudioAttributes audioAttributes) {
        return builder.setAllowedCapturePolicy(audioAttributes.getAllowedCapturePolicy());
    }

    private static AudioTrack createAudioTrackOnLowerThanLollipop(int i, int i2, int i3) {
        return new AudioTrack(0, i, i2, 2, i3, 1);
    }

    private void logBufferSizeInFrames() {
        if (Build.VERSION.SDK_INT >= 23) {
            Logging.m9d(TAG, "AudioTrack: buffer size in frames: " + this.audioTrack.getBufferSizeInFrames());
        }
    }

    @CalledByNative
    private int getBufferSizeInFrames() {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.audioTrack.getBufferSizeInFrames();
        }
        return -1;
    }

    @CalledByNative
    private int getInitialBufferSizeInFrames() {
        return this.initialBufferSizeInFrames;
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

    public void setSpeakerMute(boolean z) {
        Logging.m5w(TAG, "setSpeakerMute(" + z + ")");
        this.speakerMute = z;
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
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        Logging.m8e(TAG, "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    public void reportWebRtcAudioTrackError(String str) {
        Logging.m8e(TAG, "Run-time playback error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
    }

    public void doAudioTrackStateCallback(int i) {
        Logging.m9d(TAG, "doAudioTrackStateCallback: " + i);
        JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback = this.stateCallback;
        if (audioTrackStateCallback != null) {
            if (i == 0) {
                audioTrackStateCallback.onWebRtcAudioTrackStart();
            } else if (i == 1) {
                audioTrackStateCallback.onWebRtcAudioTrackStop();
            } else {
                Logging.m8e(TAG, "Invalid audio state");
            }
        }
    }
}
