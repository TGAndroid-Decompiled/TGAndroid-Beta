package org.webrtc.audio;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import org.webrtc.CalledByNative;
import org.webrtc.Logging;
class WebRtcAudioManager {
    private static final int BITS_PER_SAMPLE = 16;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static final int DEFAULT_SAMPLE_RATE_HZ = 16000;
    private static final String TAG = "WebRtcAudioManagerExternal";

    WebRtcAudioManager() {
    }

    @CalledByNative
    static AudioManager getAudioManager(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    @CalledByNative
    static int getOutputBufferSize(Context context, AudioManager audioManager, int i, int i2) {
        if (isLowLatencyOutputSupported(context)) {
            return getLowLatencyFramesPerBuffer(audioManager);
        }
        return getMinOutputFrameSize(i, i2);
    }

    @CalledByNative
    static int getInputBufferSize(Context context, AudioManager audioManager, int i, int i2) {
        if (isLowLatencyInputSupported(context)) {
            return getLowLatencyFramesPerBuffer(audioManager);
        }
        return getMinInputFrameSize(i, i2);
    }

    private static boolean isLowLatencyOutputSupported(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    private static boolean isLowLatencyInputSupported(Context context) {
        return Build.VERSION.SDK_INT >= 21 && isLowLatencyOutputSupported(context);
    }

    @CalledByNative
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
        String property;
        if (Build.VERSION.SDK_INT >= 17 && (property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE")) != null) {
            return Integer.parseInt(property);
        }
        return 16000;
    }

    private static int getLowLatencyFramesPerBuffer(AudioManager audioManager) {
        String property;
        if (Build.VERSION.SDK_INT >= 17 && (property = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER")) != null) {
            return Integer.parseInt(property);
        }
        return 256;
    }

    private static int getMinOutputFrameSize(int i, int i2) {
        return AudioTrack.getMinBufferSize(i, i2 == 1 ? 4 : 12, 2) / (i2 * 2);
    }

    private static int getMinInputFrameSize(int i, int i2) {
        return AudioRecord.getMinBufferSize(i, i2 == 1 ? 16 : 12, 2) / (i2 * 2);
    }
}
