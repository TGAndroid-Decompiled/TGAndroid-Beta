package org.webrtc.audio;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import org.webrtc.Logging;
class WebRtcAudioManager {
    private static final int BITS_PER_SAMPLE = 16;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static final int DEFAULT_SAMPLE_RATE_HZ = 16000;
    private static final String TAG = "WebRtcAudioManagerExternal";

    public static AudioManager getAudioManager(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    public static int getInputBufferSize(Context context, AudioManager audioManager, int i10, int i11) {
        if (isLowLatencyInputSupported(context)) {
            return getLowLatencyFramesPerBuffer(audioManager);
        }
        return getMinInputFrameSize(i10, i11);
    }

    private static int getLowLatencyFramesPerBuffer(AudioManager audioManager) {
        String property = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property == null) {
            return 256;
        }
        return Integer.parseInt(property);
    }

    private static int getMinInputFrameSize(int i10, int i11) {
        int i12;
        int i13 = i11 * 2;
        if (i11 == 1) {
            i12 = 16;
        } else {
            i12 = 12;
        }
        return AudioRecord.getMinBufferSize(i10, i12, 2) / i13;
    }

    private static int getMinOutputFrameSize(int i10, int i11) {
        int i12;
        int i13 = i11 * 2;
        if (i11 == 1) {
            i12 = 4;
        } else {
            i12 = 12;
        }
        return AudioTrack.getMinBufferSize(i10, i12, 2) / i13;
    }

    public static int getOutputBufferSize(Context context, AudioManager audioManager, int i10, int i11) {
        if (isLowLatencyOutputSupported(context)) {
            return getLowLatencyFramesPerBuffer(audioManager);
        }
        return getMinOutputFrameSize(i10, i11);
    }

    public static int getSampleRate(AudioManager audioManager) {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            Logging.d("WebRtcAudioManagerExternal", "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        }
        int sampleRateForApiLevel = getSampleRateForApiLevel(audioManager);
        Logging.d("WebRtcAudioManagerExternal", "Sample rate is set to " + sampleRateForApiLevel + " Hz");
        return sampleRateForApiLevel;
    }

    private static int getSampleRateForApiLevel(AudioManager audioManager) {
        String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property == null) {
            return 16000;
        }
        return Integer.parseInt(property);
    }

    public static boolean isLowLatencyInputSupported(Context context) {
        return isLowLatencyOutputSupported(context);
    }

    public static boolean isLowLatencyOutputSupported(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }
}
