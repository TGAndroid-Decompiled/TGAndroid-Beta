package org.webrtc.voiceengine;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.SharedConfig;
import org.webrtc.Logging;
public class WebRtcAudioEffects {
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioEffects";
    private static AudioEffect.Descriptor[] cachedEffects;
    private AcousticEchoCanceler aec;
    private NoiseSuppressor ns;
    private boolean shouldEnableAec;
    private boolean shouldEnableNs;

    private WebRtcAudioEffects() {
        Logging.d("WebRtcAudioEffects", "ctor" + WebRtcAudioUtils.getThreadInfo());
    }

    private static void assertTrue(boolean z4) {
        if (z4) {
            return;
        }
        throw new AssertionError("Expected condition to be true");
    }

    public static boolean canUseAcousticEchoCanceler() {
        boolean z4;
        if (isAcousticEchoCancelerSupported() && !WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler() && !isAcousticEchoCancelerBlacklisted() && !isAcousticEchoCancelerExcludedByUUID()) {
            z4 = true;
        } else {
            z4 = false;
        }
        Logging.d("WebRtcAudioEffects", "canUseAcousticEchoCanceler: " + z4);
        return z4;
    }

    public static boolean canUseNoiseSuppressor() {
        boolean z4;
        if (isNoiseSuppressorSupported() && !WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor() && !isNoiseSuppressorBlacklisted() && !isNoiseSuppressorExcludedByUUID()) {
            z4 = true;
        } else {
            z4 = false;
        }
        Logging.d("WebRtcAudioEffects", "canUseNoiseSuppressor: " + z4);
        return z4;
    }

    public static WebRtcAudioEffects create() {
        return new WebRtcAudioEffects();
    }

    private boolean effectTypeIsVoIP(UUID uuid) {
        if (!AudioEffect.EFFECT_TYPE_AEC.equals(uuid) || !isAcousticEchoCancelerSupported()) {
            if (AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorSupported()) {
                return true;
            }
            return false;
        }
        return true;
    }

    private static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        AudioEffect.Descriptor[] queryEffects = AudioEffect.queryEffects();
        cachedEffects = queryEffects;
        return queryEffects;
    }

    public static boolean isAcousticEchoCancelerBlacklisted() {
        List<String> blackListedModelsForAecUsage = WebRtcAudioUtils.getBlackListedModelsForAecUsage();
        String str = Build.MODEL;
        boolean contains = blackListedModelsForAecUsage.contains(str);
        if (contains) {
            Logging.w("WebRtcAudioEffects", str + " is blacklisted for HW AEC usage!");
        }
        return contains;
    }

    private static boolean isAcousticEchoCancelerEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC);
    }

    private static boolean isAcousticEchoCancelerExcludedByUUID() {
        AudioEffect.Descriptor[] availableEffects;
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AEC) && descriptor.uuid.equals(AOSP_ACOUSTIC_ECHO_CANCELER)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isAcousticEchoCancelerEffectAvailable();
    }

    private static boolean isEffectTypeAvailable(UUID uuid) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorBlacklisted() {
        List<String> blackListedModelsForNsUsage = WebRtcAudioUtils.getBlackListedModelsForNsUsage();
        String str = Build.MODEL;
        boolean contains = blackListedModelsForNsUsage.contains(str);
        if (contains) {
            Logging.w("WebRtcAudioEffects", str + " is blacklisted for HW NS usage!");
        }
        return contains;
    }

    private static boolean isNoiseSuppressorEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS);
    }

    private static boolean isNoiseSuppressorExcludedByUUID() {
        AudioEffect.Descriptor[] availableEffects;
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_NS) && descriptor.uuid.equals(AOSP_NOISE_SUPPRESSOR)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isNoiseSuppressorEffectAvailable();
    }

    public void enable(int i10) {
        boolean z4;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        String str3;
        Logging.d("WebRtcAudioEffects", "enable(audioSession=" + i10 + ")");
        boolean z12 = false;
        if (this.aec == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        assertTrue(z4);
        if (this.ns == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        assertTrue(z10);
        String str4 = "disabled";
        if (isAcousticEchoCancelerSupported()) {
            AcousticEchoCanceler create = AcousticEchoCanceler.create(i10);
            this.aec = create;
            if (create != null) {
                boolean enabled = create.getEnabled();
                if (this.shouldEnableAec && canUseAcousticEchoCanceler() && !SharedConfig.disableVoiceAudioEffects) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.aec.setEnabled(z11) != 0) {
                    Logging.e("WebRtcAudioEffects", "Failed to set the AcousticEchoCanceler state");
                }
                StringBuilder sb = new StringBuilder("AcousticEchoCanceler: was ");
                if (!enabled) {
                    str2 = "disabled";
                } else {
                    str2 = "enabled";
                }
                sb.append(str2);
                sb.append(", enable: ");
                sb.append(z11);
                sb.append(", is now: ");
                if (!this.aec.getEnabled()) {
                    str3 = "disabled";
                } else {
                    str3 = "enabled";
                }
                sb.append(str3);
                Logging.d("WebRtcAudioEffects", sb.toString());
            } else {
                Logging.e("WebRtcAudioEffects", "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (isNoiseSuppressorSupported()) {
            NoiseSuppressor create2 = NoiseSuppressor.create(i10);
            this.ns = create2;
            if (create2 != null) {
                boolean enabled2 = create2.getEnabled();
                if (this.shouldEnableNs && canUseNoiseSuppressor() && !SharedConfig.disableVoiceAudioEffects) {
                    z12 = true;
                }
                if (this.ns.setEnabled(z12) != 0) {
                    Logging.e("WebRtcAudioEffects", "Failed to set the NoiseSuppressor state");
                }
                StringBuilder sb2 = new StringBuilder("NoiseSuppressor: was ");
                if (!enabled2) {
                    str = "disabled";
                } else {
                    str = "enabled";
                }
                sb2.append(str);
                sb2.append(", enable: ");
                sb2.append(z12);
                sb2.append(", is now: ");
                if (this.ns.getEnabled()) {
                    str4 = "enabled";
                }
                sb2.append(str4);
                Logging.d("WebRtcAudioEffects", sb2.toString());
                return;
            }
            Logging.e("WebRtcAudioEffects", "Failed to create the NoiseSuppressor instance");
        }
    }

    public void release() {
        Logging.d("WebRtcAudioEffects", "release");
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        NoiseSuppressor noiseSuppressor = this.ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.ns = null;
        }
    }

    public boolean setAEC(boolean z4) {
        Logging.d("WebRtcAudioEffects", "setAEC(" + z4 + ")");
        if (!canUseAcousticEchoCanceler()) {
            Logging.w("WebRtcAudioEffects", "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        } else if (this.aec != null && z4 != this.shouldEnableAec) {
            Logging.e("WebRtcAudioEffects", "Platform AEC state can't be modified while recording");
            return false;
        } else {
            this.shouldEnableAec = z4;
            return true;
        }
    }

    public boolean setNS(boolean z4) {
        Logging.d("WebRtcAudioEffects", "setNS(" + z4 + ")");
        if (!canUseNoiseSuppressor()) {
            Logging.w("WebRtcAudioEffects", "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        } else if (this.ns != null && z4 != this.shouldEnableNs) {
            Logging.e("WebRtcAudioEffects", "Platform NS state can't be modified while recording");
            return false;
        } else {
            this.shouldEnableNs = z4;
            return true;
        }
    }
}
