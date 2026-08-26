package org.webrtc.audio;

@Deprecated
public class LegacyAudioDeviceModule implements AudioDeviceModule {
    @Override
    public long getNativeAudioDeviceModulePointer() {
        return 0L;
    }

    @Override
    public void release() {
    }

    @Override
    public void setMicrophoneMute(boolean z) {
        org.webrtc.voiceengine.WebRtcAudioRecord.setMicrophoneMute(z);
    }

    @Override
    public final boolean setNoiseSuppressorEnabled(boolean z) {
        return AudioDeviceModule.CC.$default$setNoiseSuppressorEnabled(this, z);
    }

    @Override
    public final boolean setPreferredMicrophoneFieldDimension(float f) {
        return AudioDeviceModule.CC.$default$setPreferredMicrophoneFieldDimension(this, f);
    }

    @Override
    public void setSpeakerMute(boolean z) {
        org.webrtc.voiceengine.WebRtcAudioTrack.setSpeakerMute(z);
    }
}
