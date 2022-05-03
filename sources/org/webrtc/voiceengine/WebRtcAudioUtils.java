package org.webrtc.voiceengine;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.R;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;
import org.webrtc.MediaStreamTrack;

public final class WebRtcAudioUtils {
    private static final int DEFAULT_SAMPLE_RATE_HZ = 16000;
    private static final String TAG = "WebRtcAudioUtils";
    private static int defaultSampleRateHz = 16000;
    private static boolean isDefaultSampleRateOverridden;
    private static boolean useWebRtcBasedAcousticEchoCanceler;
    private static boolean useWebRtcBasedNoiseSuppressor;
    private static final String[] BLACKLISTED_OPEN_SL_ES_MODELS = new String[0];
    private static final String[] BLACKLISTED_AEC_MODELS = new String[0];
    private static final String[] BLACKLISTED_NS_MODELS = new String[0];

    private static String deviceTypeToString(int i) {
        switch (i) {
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case 13:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom:
                return "TYPE_TELEPHONY";
            case R.styleable.MapAttrs_uiTiltGestures:
                return "TYPE_AUX_LINE";
            case R.styleable.MapAttrs_uiZoomControls:
                return "TYPE_IP";
            case R.styleable.MapAttrs_uiZoomGestures:
                return "TYPE_BUS";
            case R.styleable.MapAttrs_useViewLifecycle:
                return "TYPE_USB_HEADSET";
            default:
                return "TYPE_UNKNOWN";
        }
    }

    public static boolean isAutomaticGainControlSupported() {
        return false;
    }

    public static String modeToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION" : "MODE_IN_CALL" : "MODE_RINGTONE" : "MODE_NORMAL";
    }

    private static String streamTypeToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION" : "STREAM_ALARM" : "STREAM_MUSIC" : "STREAM_RING" : "STREAM_SYSTEM" : "STREAM_VOICE_CALL";
    }

    public static synchronized void setWebRtcBasedAcousticEchoCanceler(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            useWebRtcBasedAcousticEchoCanceler = z;
        }
    }

    public static synchronized void setWebRtcBasedNoiseSuppressor(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            useWebRtcBasedNoiseSuppressor = z;
        }
    }

    public static synchronized void setWebRtcBasedAutomaticGainControl(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            Logging.w(TAG, "setWebRtcBasedAutomaticGainControl() is deprecated");
        }
    }

    public static synchronized boolean useWebRtcBasedAcousticEchoCanceler() {
        boolean z;
        synchronized (WebRtcAudioUtils.class) {
            if (useWebRtcBasedAcousticEchoCanceler) {
                Logging.w(TAG, "Overriding default behavior; now using WebRTC AEC!");
            }
            z = useWebRtcBasedAcousticEchoCanceler;
        }
        return z;
    }

    public static synchronized boolean useWebRtcBasedNoiseSuppressor() {
        boolean z;
        synchronized (WebRtcAudioUtils.class) {
            if (useWebRtcBasedNoiseSuppressor) {
                Logging.w(TAG, "Overriding default behavior; now using WebRTC NS!");
            }
            z = useWebRtcBasedNoiseSuppressor;
        }
        return z;
    }

    public static synchronized boolean useWebRtcBasedAutomaticGainControl() {
        synchronized (WebRtcAudioUtils.class) {
        }
        return true;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    public static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    public static synchronized void setDefaultSampleRateHz(int i) {
        synchronized (WebRtcAudioUtils.class) {
            isDefaultSampleRateOverridden = true;
            defaultSampleRateHz = i;
        }
    }

    public static synchronized boolean isDefaultSampleRateOverridden() {
        boolean z;
        synchronized (WebRtcAudioUtils.class) {
            z = isDefaultSampleRateOverridden;
        }
        return z;
    }

    public static synchronized int getDefaultSampleRateHz() {
        int i;
        synchronized (WebRtcAudioUtils.class) {
            i = defaultSampleRateHz;
        }
        return i;
    }

    public static List<String> getBlackListedModelsForAecUsage() {
        return Arrays.asList(BLACKLISTED_AEC_MODELS);
    }

    public static List<String> getBlackListedModelsForNsUsage() {
        return Arrays.asList(BLACKLISTED_NS_MODELS);
    }

    public static String getThreadInfo() {
        return "@[name=" + Thread.currentThread().getName() + ", id=" + Thread.currentThread().getId() + "]";
    }

    public static boolean runningOnEmulator() {
        return Build.HARDWARE.equals("goldfish") && Build.BRAND.startsWith("generic_");
    }

    public static boolean deviceIsBlacklistedForOpenSLESUsage() {
        return Arrays.asList(BLACKLISTED_OPEN_SL_ES_MODELS).contains(Build.MODEL);
    }

    static void logDeviceInfo(String str) {
        Logging.d(str, "Android SDK: " + Build.VERSION.SDK_INT + ", Release: " + Build.VERSION.RELEASE + ", Brand: " + Build.BRAND + ", Device: " + Build.DEVICE + ", Id: " + Build.ID + ", Hardware: " + Build.HARDWARE + ", Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", Product: " + Build.PRODUCT);
    }

    public static void logAudioState(String str) {
        logDeviceInfo(str);
        AudioManager audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        logAudioStateBasic(str, audioManager);
        logAudioStateVolume(str, audioManager);
        logAudioDeviceInfo(str, audioManager);
    }

    private static void logAudioStateBasic(String str, AudioManager audioManager) {
        Logging.d(str, "Audio State: audio mode: " + modeToString(audioManager.getMode()) + ", has mic: " + hasMicrophone() + ", mic muted: " + audioManager.isMicrophoneMute() + ", music active: " + audioManager.isMusicActive() + ", speakerphone: " + audioManager.isSpeakerphoneOn() + ", BT SCO: " + audioManager.isBluetoothScoOn());
    }

    private static boolean isVolumeFixed(AudioManager audioManager) {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return audioManager.isVolumeFixed();
    }

    private static void logAudioStateVolume(String str, AudioManager audioManager) {
        int[] iArr = {0, 3, 2, 4, 5, 1};
        Logging.d(str, "Audio State: ");
        boolean isVolumeFixed = isVolumeFixed(audioManager);
        Logging.d(str, "  fixed volume=" + isVolumeFixed);
        if (!isVolumeFixed) {
            for (int i = 0; i < 6; i++) {
                int i2 = iArr[i];
                StringBuilder sb = new StringBuilder();
                sb.append("  " + streamTypeToString(i2) + ": ");
                sb.append("volume=");
                sb.append(audioManager.getStreamVolume(i2));
                sb.append(", max=");
                sb.append(audioManager.getStreamMaxVolume(i2));
                logIsStreamMute(str, audioManager, i2, sb);
                Logging.d(str, sb.toString());
            }
        }
    }

    private static void logIsStreamMute(String str, AudioManager audioManager, int i, StringBuilder sb) {
        if (Build.VERSION.SDK_INT >= 23) {
            sb.append(", muted=");
            sb.append(audioManager.isStreamMute(i));
        }
    }

    private static void logAudioDeviceInfo(String str, AudioManager audioManager) {
        if (Build.VERSION.SDK_INT >= 23) {
            AudioDeviceInfo[] devices = audioManager.getDevices(3);
            if (devices.length != 0) {
                Logging.d(str, "Audio Devices: ");
                for (AudioDeviceInfo audioDeviceInfo : devices) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("  ");
                    sb.append(deviceTypeToString(audioDeviceInfo.getType()));
                    sb.append(audioDeviceInfo.isSource() ? "(in): " : "(out): ");
                    if (audioDeviceInfo.getChannelCounts().length > 0) {
                        sb.append("channels=");
                        sb.append(Arrays.toString(audioDeviceInfo.getChannelCounts()));
                        sb.append(", ");
                    }
                    if (audioDeviceInfo.getEncodings().length > 0) {
                        sb.append("encodings=");
                        sb.append(Arrays.toString(audioDeviceInfo.getEncodings()));
                        sb.append(", ");
                    }
                    if (audioDeviceInfo.getSampleRates().length > 0) {
                        sb.append("sample rates=");
                        sb.append(Arrays.toString(audioDeviceInfo.getSampleRates()));
                        sb.append(", ");
                    }
                    sb.append("id=");
                    sb.append(audioDeviceInfo.getId());
                    Logging.d(str, sb.toString());
                }
            }
        }
    }

    private static boolean hasMicrophone() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.microphone");
    }
}
