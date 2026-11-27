package org.webrtc.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import java.nio.ByteBuffer;
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
    private static final int DEFAULT_USAGE = 2;
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

    private class AudioTrackThread extends Thread {
        private final LowLatencyAudioBufferManager bufferManager;
        private volatile boolean keepAlive;

        public AudioTrackThread(String str) {
            super(str);
            this.keepAlive = true;
            this.bufferManager = new LowLatencyAudioBufferManager();
        }

        @Override
        public void run() {
            boolean z;
            boolean z2;
            Process.setThreadPriority(-19);
            Logging.d("WebRtcAudioTrackExternal", "AudioTrackThread" + WebRtcAudioUtils.getThreadInfo());
            if (WebRtcAudioTrack.this.audioTrack.getPlayState() == 3) {
                z = true;
            } else {
                z = false;
            }
            WebRtcAudioTrack.assertTrue(z);
            WebRtcAudioTrack.this.doAudioTrackStateCallback(0);
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                WebRtcAudioTrackJni.get().getPlayoutData(WebRtcAudioTrack.this.nativeAudioTrack, capacity);
                if (capacity <= WebRtcAudioTrack.this.byteBuffer.remaining()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                WebRtcAudioTrack.assertTrue(z2);
                if (WebRtcAudioTrack.this.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                    WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                int write = WebRtcAudioTrack.this.audioTrack.write(WebRtcAudioTrack.this.byteBuffer, capacity, 0);
                if (write != capacity) {
                    Logging.e("WebRtcAudioTrackExternal", "AudioTrack.write played invalid number of bytes: " + write);
                    if (write < 0) {
                        this.keepAlive = false;
                        WebRtcAudioTrack.this.reportWebRtcAudioTrackError(uh9.k(write, "AudioTrack.write failed: "));
                    }
                }
                if (WebRtcAudioTrack.this.useLowLatency) {
                    this.bufferManager.maybeAdjustBufferSize(WebRtcAudioTrack.this.audioTrack);
                }
                WebRtcAudioTrack.this.byteBuffer.rewind();
            }
        }

        public void stopThread() {
            Logging.d("WebRtcAudioTrackExternal", "stopThread");
            this.keepAlive = false;
        }
    }

    public interface Natives {
        void cacheDirectBufferAddress(long j, ByteBuffer byteBuffer);

        void getPlayoutData(long j, int i);
    }

    public WebRtcAudioTrack(Context context, AudioManager audioManager, AudioAttributes audioAttributes, JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback, JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback, boolean z, boolean z2) {
        VolumeLogger volumeLogger;
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        threadChecker.detachThread();
        this.context = context;
        this.audioManager = audioManager;
        this.audioAttributes = audioAttributes;
        this.errorCallback = audioTrackErrorCallback;
        this.stateCallback = audioTrackStateCallback;
        if (z2) {
            volumeLogger = new VolumeLogger(audioManager);
        } else {
            volumeLogger = null;
        }
        this.volumeLogger = volumeLogger;
        this.useLowLatency = z;
        Logging.d("WebRtcAudioTrackExternal", "ctor" + WebRtcAudioUtils.getThreadInfo());
    }

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

    private static AudioAttributes.Builder applyAttributesOnQOrHigher(AudioAttributes.Builder builder, AudioAttributes audioAttributes) {
        return builder.setAllowedCapturePolicy(audioAttributes.getAllowedCapturePolicy());
    }

    public static void assertTrue(boolean z) {
        if (z) {
            return;
        }
        hz6.e("Expected condition to be true");
    }

    private int channelCountToConfiguration(int i) {
        if (i == 1) {
            return 4;
        }
        return 12;
    }

    private static AudioTrack createAudioTrackBeforeOreo(int i, int i2, int i3, AudioAttributes audioAttributes) {
        Logging.d("WebRtcAudioTrackExternal", "createAudioTrackBeforeOreo");
        logNativeOutputSampleRate(i);
        return new AudioTrack(getAudioAttributes(audioAttributes), new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build(), i3, 1, 0);
    }

    private static AudioTrack createAudioTrackOnOreoOrHigher(int i, int i2, int i3, AudioAttributes audioAttributes) {
        Logging.d("WebRtcAudioTrackExternal", "createAudioTrackOnOreoOrHigher");
        logNativeOutputSampleRate(i);
        return new AudioTrack.Builder().setAudioAttributes(getAudioAttributes(audioAttributes)).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build()).setBufferSizeInBytes(i3).setPerformanceMode(1).setTransferMode(1).setSessionId(0).build();
    }

    public void doAudioTrackStateCallback(int i) {
        Logging.d("WebRtcAudioTrackExternal", "doAudioTrackStateCallback: " + i);
        JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback = this.stateCallback;
        if (audioTrackStateCallback != null) {
            if (i == 0) {
                audioTrackStateCallback.onWebRtcAudioTrackStart();
            } else if (i == 1) {
                audioTrackStateCallback.onWebRtcAudioTrackStop();
            } else {
                Logging.e("WebRtcAudioTrackExternal", "Invalid audio state");
            }
        }
    }

    private static AudioAttributes getAudioAttributes(AudioAttributes audioAttributes) {
        AudioAttributes.Builder contentType = new AudioAttributes.Builder().setUsage(2).setContentType(1);
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

    private int getBufferSizeInFrames() {
        return this.audioTrack.getBufferSizeInFrames();
    }

    private int getInitialBufferSizeInFrames() {
        return this.initialBufferSizeInFrames;
    }

    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.d("WebRtcAudioTrackExternal", "getStreamMaxVolume");
        return this.audioManager.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.d("WebRtcAudioTrackExternal", "getStreamVolume");
        return this.audioManager.getStreamVolume(0);
    }

    private int initPlayout(int i, int i2, double d) {
        AudioTrack createAudioTrackBeforeOreo;
        try {
            this.threadChecker.checkIsOnValidThread();
            StringBuilder p = bs2.p("initPlayout(sampleRate=", i, ", channels=", i2, ", bufferSizeFactor=");
            p.append(d);
            p.append(")");
            Logging.d("WebRtcAudioTrackExternal", p.toString());
            try {
                this.byteBuffer = ByteBuffer.allocateDirect((i2 << 1) * (i / 100));
                Logging.d("WebRtcAudioTrackExternal", "byteBuffer.capacity: " + this.byteBuffer.capacity());
                this.emptyBytes = new byte[this.byteBuffer.capacity()];
                WebRtcAudioTrackJni.get().cacheDirectBufferAddress(this.nativeAudioTrack, this.byteBuffer);
                int channelCountToConfiguration = channelCountToConfiguration(i2);
                int minBufferSize = (int) (AudioTrack.getMinBufferSize(i, channelCountToConfiguration, 2) * d);
                Logging.d("WebRtcAudioTrackExternal", "minBufferSizeInBytes: " + minBufferSize);
                if (minBufferSize < this.byteBuffer.capacity()) {
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
                        createAudioTrackBeforeOreo = createAudioTrackOnOreoOrHigher(i, channelCountToConfiguration, minBufferSize, this.audioAttributes);
                        this.audioTrack = createAudioTrackBeforeOreo;
                    } else {
                        createAudioTrackBeforeOreo = createAudioTrackBeforeOreo(i, channelCountToConfiguration, minBufferSize, this.audioAttributes);
                        this.audioTrack = createAudioTrackBeforeOreo;
                    }
                    if (createAudioTrackBeforeOreo != null && createAudioTrackBeforeOreo.getState() == 1) {
                        this.initialBufferSizeInFrames = this.audioTrack.getBufferSizeInFrames();
                        logMainParameters();
                        logMainParametersExtended();
                        return minBufferSize;
                    }
                    reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                    releaseAudioResources();
                    return -1;
                } catch (IllegalArgumentException e) {
                    reportWebRtcAudioTrackInitError(e.getMessage());
                    releaseAudioResources();
                    return -1;
                } catch (Throwable th) {
                    reportWebRtcAudioTrackInitError("InitPlayout error: " + th.getClass().getSimpleName() + ": " + th.getMessage());
                    releaseAudioResources();
                    return -1;
                }
            } catch (OutOfMemoryError | RuntimeException e2) {
                reportWebRtcAudioTrackInitError("allocateDirect failed: " + e2.getMessage());
                return -1;
            }
        } catch (IllegalStateException e3) {
            reportWebRtcAudioTrackInitError("threadChecker.checkIsOnValidThread failed: " + e3.getMessage());
            return -1;
        }
    }

    private void logBufferCapacityInFrames() {
        if (Build.VERSION.SDK_INT >= 24) {
            Logging.d("WebRtcAudioTrackExternal", "AudioTrack: buffer capacity in frames: " + this.audioTrack.getBufferCapacityInFrames());
        }
    }

    private void logBufferSizeInFrames() {
        Logging.d("WebRtcAudioTrackExternal", "AudioTrack: buffer size in frames: " + this.audioTrack.getBufferSizeInFrames());
    }

    private void logMainParameters() {
        Logging.d("WebRtcAudioTrackExternal", "AudioTrack: session ID: " + this.audioTrack.getAudioSessionId() + ", channels: " + this.audioTrack.getChannelCount() + ", sample rate: " + this.audioTrack.getSampleRate() + ", max gain: " + AudioTrack.getMaxVolume());
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    private static void logNativeOutputSampleRate(int i) {
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        Logging.d("WebRtcAudioTrackExternal", "nativeOutputSampleRate: " + nativeOutputSampleRate);
        if (i != nativeOutputSampleRate) {
            Logging.w("WebRtcAudioTrackExternal", "Unable to use fast mode since requested sample rate is not native");
        }
    }

    private void logUnderrunCount() {
        if (Build.VERSION.SDK_INT >= 24) {
            Logging.d("WebRtcAudioTrackExternal", "underrun count: " + this.audioTrack.getUnderrunCount());
        }
    }

    private void releaseAudioResources() {
        Logging.d("WebRtcAudioTrackExternal", "releaseAudioResources");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    public void reportWebRtcAudioTrackError(String str) {
        Logging.e("WebRtcAudioTrackExternal", "Run-time playback error: " + str);
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrackExternal", this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        Logging.e("WebRtcAudioTrackExternal", "Init playout error: " + str);
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrackExternal", this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        Logging.e("WebRtcAudioTrackExternal", "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrackExternal", this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    private boolean setStreamVolume(int i) {
        this.threadChecker.checkIsOnValidThread();
        Logging.d("WebRtcAudioTrackExternal", "setStreamVolume(" + i + ")");
        if (this.audioManager.isVolumeFixed()) {
            Logging.e("WebRtcAudioTrackExternal", "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i, 0);
        return true;
    }

    private boolean startPlayout() {
        boolean z;
        boolean z2;
        this.threadChecker.checkIsOnValidThread();
        VolumeLogger volumeLogger = this.volumeLogger;
        if (volumeLogger != null) {
            volumeLogger.start();
        }
        Logging.d("WebRtcAudioTrackExternal", "startPlayout");
        if (this.audioTrack != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        if (this.audioThread == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        assertTrue(z2);
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState());
                releaseAudioResources();
                return false;
            }
            AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        } catch (IllegalStateException e) {
            reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, "AudioTrack.play failed: " + e.getMessage());
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopPlayout() {
        boolean z;
        this.threadChecker.checkIsOnValidThread();
        VolumeLogger volumeLogger = this.volumeLogger;
        if (volumeLogger != null) {
            volumeLogger.stop();
        }
        Logging.d("WebRtcAudioTrackExternal", "stopPlayout");
        if (this.audioThread != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        logUnderrunCount();
        this.audioThread.stopThread();
        Logging.d("WebRtcAudioTrackExternal", "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
            Logging.e("WebRtcAudioTrackExternal", "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState("WebRtcAudioTrackExternal", this.context, this.audioManager);
        }
        Logging.d("WebRtcAudioTrackExternal", "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        if (this.audioTrack != null) {
            Logging.d("WebRtcAudioTrackExternal", "Calling AudioTrack.stop...");
            try {
                this.audioTrack.stop();
                Logging.d("WebRtcAudioTrackExternal", "AudioTrack.stop is done.");
                doAudioTrackStateCallback(1);
            } catch (IllegalStateException e) {
                Logging.e("WebRtcAudioTrackExternal", "AudioTrack.stop failed: " + e.getMessage());
            }
        }
        releaseAudioResources();
        return true;
    }

    public void setNativeAudioTrack(long j) {
        this.nativeAudioTrack = j;
    }

    public void setSpeakerMute(boolean z) {
        Logging.w("WebRtcAudioTrackExternal", "setSpeakerMute(" + z + ")");
        this.speakerMute = z;
    }

    public WebRtcAudioTrack(Context context, AudioManager audioManager) {
        this(context, audioManager, null, null, null, false, true);
    }
}
