package org.webrtc.audio;
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z4);

    boolean setNoiseSuppressorEnabled(boolean z4);

    boolean setPreferredMicrophoneFieldDimension(float f10);

    void setSpeakerMute(boolean z4);
}
