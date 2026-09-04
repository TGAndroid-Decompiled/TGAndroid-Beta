package org.webrtc.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import java.util.concurrent.ScheduledExecutorService;
import org.webrtc.JniCommon;
import org.webrtc.Logging;
public class JavaAudioDeviceModule implements AudioDeviceModule {
    private static final String TAG = "JavaAudioDeviceModule";
    private final WebRtcAudioRecord audioInput;
    private final AudioManager audioManager;
    private final WebRtcAudioTrack audioOutput;
    private final Context context;
    private final int inputSampleRate;
    private long nativeAudioDeviceModule;
    private final Object nativeLock;
    private final int outputSampleRate;
    private final boolean useStereoInput;
    private final boolean useStereoOutput;

    public interface AudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    public interface AudioRecordStateCallback {
        void onWebRtcAudioRecordStart();

        void onWebRtcAudioRecordStop();
    }

    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        public AudioSamples(int i10, int i11, int i12, byte[] bArr) {
            this.audioFormat = i10;
            this.channelCount = i11;
            this.sampleRate = i12;
            this.data = bArr;
        }

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }
    }

    public interface AudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    public interface AudioTrackStateCallback {
        void onWebRtcAudioTrackStart();

        void onWebRtcAudioTrackStop();
    }

    public static class Builder {
        private AudioAttributes audioAttributes;
        private int audioFormat;
        private final AudioManager audioManager;
        private AudioRecordErrorCallback audioRecordErrorCallback;
        private AudioRecordStateCallback audioRecordStateCallback;
        private int audioSource;
        private AudioTrackErrorCallback audioTrackErrorCallback;
        private AudioTrackStateCallback audioTrackStateCallback;
        private final Context context;
        private boolean enableVolumeLogger;
        private int inputSampleRate;
        private int outputSampleRate;
        private SamplesReadyCallback samplesReadyCallback;
        private ScheduledExecutorService scheduler;
        private boolean useHardwareAcousticEchoCanceler;
        private boolean useHardwareNoiseSuppressor;
        private boolean useLowLatency;
        private boolean useStereoInput;
        private boolean useStereoOutput;

        public JavaAudioDeviceModule createAudioDeviceModule() {
            Logging.d("JavaAudioDeviceModule", "createAudioDeviceModule");
            if (this.useHardwareNoiseSuppressor) {
                Logging.d("JavaAudioDeviceModule", "HW NS will be used.");
            } else {
                if (JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()) {
                    Logging.d("JavaAudioDeviceModule", "Overriding default behavior; now using WebRTC NS!");
                }
                Logging.d("JavaAudioDeviceModule", "HW NS will not be used.");
            }
            if (this.useHardwareAcousticEchoCanceler) {
                Logging.d("JavaAudioDeviceModule", "HW AEC will be used.");
            } else {
                if (JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()) {
                    Logging.d("JavaAudioDeviceModule", "Overriding default behavior; now using WebRTC AEC!");
                }
                Logging.d("JavaAudioDeviceModule", "HW AEC will not be used.");
            }
            if (this.useLowLatency && Build.VERSION.SDK_INT >= 26) {
                Logging.d("JavaAudioDeviceModule", "Low latency mode will be used.");
            }
            ScheduledExecutorService scheduledExecutorService = this.scheduler;
            if (scheduledExecutorService == null) {
                scheduledExecutorService = WebRtcAudioRecord.newDefaultScheduler();
            }
            return new JavaAudioDeviceModule(this.context, this.audioManager, new WebRtcAudioRecord(this.context, scheduledExecutorService, this.audioManager, this.audioSource, this.audioFormat, this.audioRecordErrorCallback, this.audioRecordStateCallback, this.samplesReadyCallback, this.useHardwareAcousticEchoCanceler, this.useHardwareNoiseSuppressor), new WebRtcAudioTrack(this.context, this.audioManager, this.audioAttributes, this.audioTrackErrorCallback, this.audioTrackStateCallback, this.useLowLatency, this.enableVolumeLogger), this.inputSampleRate, this.outputSampleRate, this.useStereoInput, this.useStereoOutput);
        }

        public Builder setAudioAttributes(AudioAttributes audioAttributes) {
            this.audioAttributes = audioAttributes;
            return this;
        }

        public Builder setAudioFormat(int i10) {
            this.audioFormat = i10;
            return this;
        }

        public Builder setAudioRecordErrorCallback(AudioRecordErrorCallback audioRecordErrorCallback) {
            this.audioRecordErrorCallback = audioRecordErrorCallback;
            return this;
        }

        public Builder setAudioRecordStateCallback(AudioRecordStateCallback audioRecordStateCallback) {
            this.audioRecordStateCallback = audioRecordStateCallback;
            return this;
        }

        public Builder setAudioSource(int i10) {
            this.audioSource = i10;
            return this;
        }

        public Builder setAudioTrackErrorCallback(AudioTrackErrorCallback audioTrackErrorCallback) {
            this.audioTrackErrorCallback = audioTrackErrorCallback;
            return this;
        }

        public Builder setAudioTrackStateCallback(AudioTrackStateCallback audioTrackStateCallback) {
            this.audioTrackStateCallback = audioTrackStateCallback;
            return this;
        }

        public Builder setEnableVolumeLogger(boolean z10) {
            this.enableVolumeLogger = z10;
            return this;
        }

        public Builder setInputSampleRate(int i10) {
            Logging.d("JavaAudioDeviceModule", "Input sample rate overridden to: " + i10);
            this.inputSampleRate = i10;
            return this;
        }

        public Builder setOutputSampleRate(int i10) {
            Logging.d("JavaAudioDeviceModule", "Output sample rate overridden to: " + i10);
            this.outputSampleRate = i10;
            return this;
        }

        public Builder setSampleRate(int i10) {
            Logging.d("JavaAudioDeviceModule", "Input/Output sample rate overridden to: " + i10);
            this.inputSampleRate = i10;
            this.outputSampleRate = i10;
            return this;
        }

        public Builder setSamplesReadyCallback(SamplesReadyCallback samplesReadyCallback) {
            this.samplesReadyCallback = samplesReadyCallback;
            return this;
        }

        public Builder setScheduler(ScheduledExecutorService scheduledExecutorService) {
            this.scheduler = scheduledExecutorService;
            return this;
        }

        public Builder setUseHardwareAcousticEchoCanceler(boolean z10) {
            if (z10 && !JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()) {
                Logging.e("JavaAudioDeviceModule", "HW AEC not supported");
                z10 = false;
            }
            this.useHardwareAcousticEchoCanceler = z10;
            return this;
        }

        public Builder setUseHardwareNoiseSuppressor(boolean z10) {
            if (z10 && !JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()) {
                Logging.e("JavaAudioDeviceModule", "HW NS not supported");
                z10 = false;
            }
            this.useHardwareNoiseSuppressor = z10;
            return this;
        }

        public Builder setUseLowLatency(boolean z10) {
            this.useLowLatency = z10;
            return this;
        }

        public Builder setUseStereoInput(boolean z10) {
            this.useStereoInput = z10;
            return this;
        }

        public Builder setUseStereoOutput(boolean z10) {
            this.useStereoOutput = z10;
            return this;
        }

        private Builder(Context context) {
            this.audioSource = 7;
            this.audioFormat = 2;
            this.useHardwareAcousticEchoCanceler = JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported();
            this.useHardwareNoiseSuppressor = JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported();
            this.context = context;
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.audioManager = audioManager;
            this.inputSampleRate = WebRtcAudioManager.getSampleRate(audioManager);
            this.outputSampleRate = WebRtcAudioManager.getSampleRate(audioManager);
            this.useLowLatency = false;
            this.enableVolumeLogger = true;
        }
    }

    public interface SamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    public static Builder builder(Context context) {
        return new Builder(context);
    }

    public static boolean isBuiltInAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.isAcousticEchoCancelerSupported();
    }

    public static boolean isBuiltInNoiseSuppressorSupported() {
        return WebRtcAudioEffects.isNoiseSuppressorSupported();
    }

    private static native long nativeCreateAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i10, int i11, boolean z10, boolean z11);

    @Override
    public long getNativeAudioDeviceModulePointer() {
        long j3;
        synchronized (this.nativeLock) {
            try {
                if (this.nativeAudioDeviceModule == 0) {
                    this.nativeAudioDeviceModule = nativeCreateAudioDeviceModule(this.context, this.audioManager, this.audioInput, this.audioOutput, this.inputSampleRate, this.outputSampleRate, this.useStereoInput, this.useStereoOutput);
                }
                j3 = this.nativeAudioDeviceModule;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j3;
    }

    @Override
    public void release() {
        synchronized (this.nativeLock) {
            try {
                long j3 = this.nativeAudioDeviceModule;
                if (j3 != 0) {
                    JniCommon.nativeReleaseRef(j3);
                    this.nativeAudioDeviceModule = 0L;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void setMicrophoneMute(boolean z10) {
        Logging.d("JavaAudioDeviceModule", "setMicrophoneMute: " + z10);
        this.audioInput.setMicrophoneMute(z10);
    }

    @Override
    public boolean setNoiseSuppressorEnabled(boolean z10) {
        Logging.d("JavaAudioDeviceModule", "setNoiseSuppressorEnabled: " + z10);
        return this.audioInput.setNoiseSuppressorEnabled(z10);
    }

    public void setPreferredInputDevice(AudioDeviceInfo audioDeviceInfo) {
        Logging.d("JavaAudioDeviceModule", "setPreferredInputDevice: " + audioDeviceInfo);
        this.audioInput.setPreferredDevice(audioDeviceInfo);
    }

    @Override
    public final boolean setPreferredMicrophoneFieldDimension(float f7) {
        return a.b(this, f7);
    }

    @Override
    public void setSpeakerMute(boolean z10) {
        Logging.d("JavaAudioDeviceModule", "setSpeakerMute: " + z10);
        this.audioOutput.setSpeakerMute(z10);
    }

    private JavaAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i10, int i11, boolean z10, boolean z11) {
        this.nativeLock = new Object();
        this.context = context;
        this.audioManager = audioManager;
        this.audioInput = webRtcAudioRecord;
        this.audioOutput = webRtcAudioTrack;
        this.inputSampleRate = i10;
        this.outputSampleRate = i11;
        this.useStereoInput = z10;
        this.useStereoOutput = z11;
    }
}
