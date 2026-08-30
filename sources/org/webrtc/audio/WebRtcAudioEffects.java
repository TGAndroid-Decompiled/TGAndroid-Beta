package org.webrtc.audio;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import java.util.UUID;
import org.webrtc.Logging;
class WebRtcAudioEffects {
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioEffectsExternal";
    private static AudioEffect.Descriptor[] cachedEffects;
    private AcousticEchoCanceler aec;
    private NoiseSuppressor ns;
    private boolean shouldEnableAec;
    private boolean shouldEnableNs;

    public WebRtcAudioEffects() {
        Logging.d("WebRtcAudioEffectsExternal", "ctor" + WebRtcAudioUtils.getThreadInfo());
    }

    private static void assertTrue(boolean z4) {
        if (z4) {
            return;
        }
        throw new AssertionError("Expected condition to be true");
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

    public static boolean isAcousticEchoCancelerSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC, AOSP_ACOUSTIC_ECHO_CANCELER);
    }

    private static boolean isEffectTypeAvailable(UUID uuid, UUID uuid2) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return !descriptor.uuid.equals(uuid2);
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS, AOSP_NOISE_SUPPRESSOR);
    }

    public void enable(int i10) {
        boolean z4;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        String str3;
        Logging.d("WebRtcAudioEffectsExternal", "enable(audioSession=" + i10 + ")");
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
                if (this.shouldEnableAec && isAcousticEchoCancelerSupported()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.aec.setEnabled(z11) != 0) {
                    Logging.e("WebRtcAudioEffectsExternal", "Failed to set the AcousticEchoCanceler state");
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
                Logging.d("WebRtcAudioEffectsExternal", sb.toString());
            } else {
                Logging.e("WebRtcAudioEffectsExternal", "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (isNoiseSuppressorSupported()) {
            NoiseSuppressor create2 = NoiseSuppressor.create(i10);
            this.ns = create2;
            if (create2 != null) {
                boolean enabled2 = create2.getEnabled();
                if (this.shouldEnableNs && isNoiseSuppressorSupported()) {
                    z12 = true;
                }
                if (this.ns.setEnabled(z12) != 0) {
                    Logging.e("WebRtcAudioEffectsExternal", "Failed to set the NoiseSuppressor state");
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
                Logging.d("WebRtcAudioEffectsExternal", sb2.toString());
                return;
            }
            Logging.e("WebRtcAudioEffectsExternal", "Failed to create the NoiseSuppressor instance");
        }
    }

    public void release() {
        Logging.d("WebRtcAudioEffectsExternal", "release");
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
        Logging.d("WebRtcAudioEffectsExternal", "setAEC(" + z4 + ")");
        if (!isAcousticEchoCancelerSupported()) {
            Logging.w("WebRtcAudioEffectsExternal", "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        } else if (this.aec != null && z4 != this.shouldEnableAec) {
            Logging.e("WebRtcAudioEffectsExternal", "Platform AEC state can't be modified while recording");
            return false;
        } else {
            this.shouldEnableAec = z4;
            return true;
        }
    }

    public boolean setNS(boolean z4) {
        Logging.d("WebRtcAudioEffectsExternal", "setNS(" + z4 + ")");
        if (!isNoiseSuppressorSupported()) {
            Logging.w("WebRtcAudioEffectsExternal", "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        } else if (this.ns != null && z4 != this.shouldEnableNs) {
            Logging.e("WebRtcAudioEffectsExternal", "Platform NS state can't be modified while recording");
            return false;
        } else {
            this.shouldEnableNs = z4;
            return true;
        }
    }

    public boolean toggleNS(boolean z4) {
        if (this.ns == null) {
            Logging.e("WebRtcAudioEffectsExternal", "Attempting to enable or disable nonexistent NoiseSuppressor.");
            return false;
        }
        Logging.d("WebRtcAudioEffectsExternal", "toggleNS(" + z4 + ")");
        if (this.ns.setEnabled(z4) != 0) {
            return false;
        }
        return true;
    }
}
