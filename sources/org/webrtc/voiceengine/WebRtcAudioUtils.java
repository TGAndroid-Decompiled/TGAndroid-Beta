package org.webrtc.voiceengine;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;
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

    public static boolean deviceIsBlacklistedForOpenSLESUsage() {
        return Arrays.asList(BLACKLISTED_OPEN_SL_ES_MODELS).contains(Build.MODEL);
    }

    private static String deviceTypeToString(int i10) {
        switch (i10) {
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
            case 18:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            default:
                return "TYPE_UNKNOWN";
        }
    }

    public static List<String> getBlackListedModelsForAecUsage() {
        return Arrays.asList(BLACKLISTED_AEC_MODELS);
    }

    public static List<String> getBlackListedModelsForNsUsage() {
        return Arrays.asList(BLACKLISTED_NS_MODELS);
    }

    public static synchronized int getDefaultSampleRateHz() {
        int i10;
        synchronized (WebRtcAudioUtils.class) {
            i10 = defaultSampleRateHz;
        }
        return i10;
    }

    public static String getThreadInfo() {
        return "@[name=" + Thread.currentThread().getName() + ", id=" + Thread.currentThread().getId() + "]";
    }

    private static boolean hasMicrophone() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    public static boolean isAutomaticGainControlSupported() {
        return false;
    }

    public static synchronized boolean isDefaultSampleRateOverridden() {
        boolean z4;
        synchronized (WebRtcAudioUtils.class) {
            z4 = isDefaultSampleRateOverridden;
        }
        return z4;
    }

    public static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private static boolean isVolumeFixed(AudioManager audioManager) {
        return audioManager.isVolumeFixed();
    }

    private static void logAudioDeviceInfo(String str, AudioManager audioManager) {
        String str2;
        if (Build.VERSION.SDK_INT >= 23) {
            AudioDeviceInfo[] devices = audioManager.getDevices(3);
            if (devices.length != 0) {
                Logging.d(str, "Audio Devices: ");
                for (AudioDeviceInfo audioDeviceInfo : devices) {
                    StringBuilder sb = new StringBuilder("  ");
                    sb.append(deviceTypeToString(audioDeviceInfo.getType()));
                    if (audioDeviceInfo.isSource()) {
                        str2 = "(in): ";
                    } else {
                        str2 = "(out): ";
                    }
                    sb.append(str2);
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

    public static void logAudioState(String str) {
        logDeviceInfo(str);
        AudioManager audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
        logAudioStateBasic(str, audioManager);
        logAudioStateVolume(str, audioManager);
        logAudioDeviceInfo(str, audioManager);
    }

    private static void logAudioStateBasic(String str, AudioManager audioManager) {
        Logging.d(str, "Audio State: audio mode: " + modeToString(audioManager.getMode()) + ", has mic: " + hasMicrophone() + ", mic muted: " + audioManager.isMicrophoneMute() + ", music active: " + audioManager.isMusicActive() + ", speakerphone: " + audioManager.isSpeakerphoneOn() + ", BT SCO: " + audioManager.isBluetoothScoOn());
    }

    private static void logAudioStateVolume(String str, AudioManager audioManager) {
        int[] iArr = {0, 3, 2, 4, 5, 1};
        Logging.d(str, "Audio State: ");
        boolean isVolumeFixed = isVolumeFixed(audioManager);
        Logging.d(str, "  fixed volume=" + isVolumeFixed);
        if (!isVolumeFixed) {
            for (int i10 = 0; i10 < 6; i10++) {
                int i11 = iArr[i10];
                StringBuilder sb = new StringBuilder();
                sb.append("  " + streamTypeToString(i11) + ": ");
                sb.append("volume=");
                sb.append(audioManager.getStreamVolume(i11));
                sb.append(", max=");
                sb.append(audioManager.getStreamMaxVolume(i11));
                logIsStreamMute(str, audioManager, i11, sb);
                Logging.d(str, sb.toString());
            }
        }
    }

    public static void logDeviceInfo(String str) {
        Logging.d(str, "Android SDK: " + Build.VERSION.SDK_INT + ", Release: " + Build.VERSION.RELEASE + ", Brand: " + Build.BRAND + ", Device: " + Build.DEVICE + ", Id: " + Build.ID + ", Hardware: " + Build.HARDWARE + ", Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", Product: " + Build.PRODUCT);
    }

    private static void logIsStreamMute(String str, AudioManager audioManager, int i10, StringBuilder sb) {
        if (Build.VERSION.SDK_INT >= 23) {
            sb.append(", muted=");
            sb.append(audioManager.isStreamMute(i10));
        }
    }

    public static String modeToString(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return "MODE_INVALID";
                    }
                    return "MODE_IN_COMMUNICATION";
                }
                return "MODE_IN_CALL";
            }
            return "MODE_RINGTONE";
        }
        return "MODE_NORMAL";
    }

    public static boolean runningOnEmulator() {
        if (Build.HARDWARE.equals("goldfish") && Build.BRAND.startsWith("generic_")) {
            return true;
        }
        return false;
    }

    public static synchronized void setDefaultSampleRateHz(int i10) {
        synchronized (WebRtcAudioUtils.class) {
            isDefaultSampleRateOverridden = true;
            defaultSampleRateHz = i10;
        }
    }

    public static synchronized void setWebRtcBasedAcousticEchoCanceler(boolean z4) {
        synchronized (WebRtcAudioUtils.class) {
            useWebRtcBasedAcousticEchoCanceler = z4;
        }
    }

    public static synchronized void setWebRtcBasedAutomaticGainControl(boolean z4) {
        synchronized (WebRtcAudioUtils.class) {
            Logging.w("WebRtcAudioUtils", "setWebRtcBasedAutomaticGainControl() is deprecated");
        }
    }

    public static synchronized void setWebRtcBasedNoiseSuppressor(boolean z4) {
        synchronized (WebRtcAudioUtils.class) {
            useWebRtcBasedNoiseSuppressor = z4;
        }
    }

    private static String streamTypeToString(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return "STREAM_INVALID";
                            }
                            return "STREAM_NOTIFICATION";
                        }
                        return "STREAM_ALARM";
                    }
                    return "STREAM_MUSIC";
                }
                return "STREAM_RING";
            }
            return "STREAM_SYSTEM";
        }
        return "STREAM_VOICE_CALL";
    }

    public static synchronized boolean useWebRtcBasedAcousticEchoCanceler() {
        boolean z4;
        synchronized (WebRtcAudioUtils.class) {
            try {
                if (useWebRtcBasedAcousticEchoCanceler) {
                    Logging.w("WebRtcAudioUtils", "Overriding default behavior; now using WebRTC AEC!");
                }
                z4 = useWebRtcBasedAcousticEchoCanceler;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z4;
    }

    public static synchronized boolean useWebRtcBasedAutomaticGainControl() {
        synchronized (WebRtcAudioUtils.class) {
        }
        return true;
    }

    public static synchronized boolean useWebRtcBasedNoiseSuppressor() {
        boolean z4;
        synchronized (WebRtcAudioUtils.class) {
            try {
                if (useWebRtcBasedNoiseSuppressor) {
                    Logging.w("WebRtcAudioUtils", "Overriding default behavior; now using WebRTC NS!");
                }
                z4 = useWebRtcBasedNoiseSuppressor;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z4;
    }
}
