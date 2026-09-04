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

    private static void assertTrue(boolean z10) {
        if (z10) {
            return;
        }
        throw new AssertionError("Expected condition to be true");
    }

    public static boolean canUseAcousticEchoCanceler() {
        boolean z10;
        if (isAcousticEchoCancelerSupported() && !WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler() && !isAcousticEchoCancelerBlacklisted() && !isAcousticEchoCancelerExcludedByUUID()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Logging.d("WebRtcAudioEffects", "canUseAcousticEchoCanceler: " + z10);
        return z10;
    }

    public static boolean canUseNoiseSuppressor() {
        boolean z10;
        if (isNoiseSuppressorSupported() && !WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor() && !isNoiseSuppressorBlacklisted() && !isNoiseSuppressorExcludedByUUID()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Logging.d("WebRtcAudioEffects", "canUseNoiseSuppressor: " + z10);
        return z10;
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
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        String str2;
        String str3;
        Logging.d("WebRtcAudioEffects", "enable(audioSession=" + i10 + ")");
        boolean z13 = false;
        if (this.aec == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        assertTrue(z10);
        if (this.ns == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        assertTrue(z11);
        String str4 = "disabled";
        if (isAcousticEchoCancelerSupported()) {
            AcousticEchoCanceler create = AcousticEchoCanceler.create(i10);
            this.aec = create;
            if (create != null) {
                boolean enabled = create.getEnabled();
                if (this.shouldEnableAec && canUseAcousticEchoCanceler() && !SharedConfig.disableVoiceAudioEffects) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (this.aec.setEnabled(z12) != 0) {
                    Logging.e("WebRtcAudioEffects", "Failed to set the AcousticEchoCanceler state");
                }
                StringBuilder sb2 = new StringBuilder("AcousticEchoCanceler: was ");
                if (!enabled) {
                    str2 = "disabled";
                } else {
                    str2 = "enabled";
                }
                sb2.append(str2);
                sb2.append(", enable: ");
                sb2.append(z12);
                sb2.append(", is now: ");
                if (!this.aec.getEnabled()) {
                    str3 = "disabled";
                } else {
                    str3 = "enabled";
                }
                sb2.append(str3);
                Logging.d("WebRtcAudioEffects", sb2.toString());
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
                    z13 = true;
                }
                if (this.ns.setEnabled(z13) != 0) {
                    Logging.e("WebRtcAudioEffects", "Failed to set the NoiseSuppressor state");
                }
                StringBuilder sb3 = new StringBuilder("NoiseSuppressor: was ");
                if (!enabled2) {
                    str = "disabled";
                } else {
                    str = "enabled";
                }
                sb3.append(str);
                sb3.append(", enable: ");
                sb3.append(z13);
                sb3.append(", is now: ");
                if (this.ns.getEnabled()) {
                    str4 = "enabled";
                }
                sb3.append(str4);
                Logging.d("WebRtcAudioEffects", sb3.toString());
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

    public boolean setAEC(boolean z10) {
        Logging.d("WebRtcAudioEffects", "setAEC(" + z10 + ")");
        if (!canUseAcousticEchoCanceler()) {
            Logging.w("WebRtcAudioEffects", "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        } else if (this.aec != null && z10 != this.shouldEnableAec) {
            Logging.e("WebRtcAudioEffects", "Platform AEC state can't be modified while recording");
            return false;
        } else {
            this.shouldEnableAec = z10;
            return true;
        }
    }

    public boolean setNS(boolean z10) {
        Logging.d("WebRtcAudioEffects", "setNS(" + z10 + ")");
        if (!canUseNoiseSuppressor()) {
            Logging.w("WebRtcAudioEffects", "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        } else if (this.ns != null && z10 != this.shouldEnableNs) {
            Logging.e("WebRtcAudioEffects", "Platform NS state can't be modified while recording");
            return false;
        } else {
            this.shouldEnableNs = z10;
            return true;
        }
    }
}
