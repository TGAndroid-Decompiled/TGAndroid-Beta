package org.webrtc.audio;
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z9);

    boolean setNoiseSuppressorEnabled(boolean z9);

    boolean setPreferredMicrophoneFieldDimension(float f10);

    void setSpeakerMute(boolean z9);
}
