package org.webrtc.audio;

public interface AudioDeviceModule {

    public abstract class CC {
        public static boolean $default$setNoiseSuppressorEnabled(AudioDeviceModule audioDeviceModule, boolean z) {
            return false;
        }

        public static boolean $default$setPreferredMicrophoneFieldDimension(AudioDeviceModule audioDeviceModule, float f) {
            return false;
        }
    }

    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z);

    boolean setNoiseSuppressorEnabled(boolean z);

    boolean setPreferredMicrophoneFieldDimension(float f);

    void setSpeakerMute(boolean z);
}
