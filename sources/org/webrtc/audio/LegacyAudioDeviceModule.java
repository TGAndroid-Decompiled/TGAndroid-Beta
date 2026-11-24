package org.webrtc.audio;
@Deprecated
public class LegacyAudioDeviceModule implements AudioDeviceModule {
    @Override
    public long getNativeAudioDeviceModulePointer() {
        return 0L;
    }

    @Override
    public void setMicrophoneMute(boolean z) {
        org.webrtc.voiceengine.WebRtcAudioRecord.setMicrophoneMute(z);
    }

    @Override
    public final boolean setNoiseSuppressorEnabled(boolean z) {
        return false;
    }

    @Override
    public final boolean setPreferredMicrophoneFieldDimension(float f) {
        return false;
    }

    @Override
    public void setSpeakerMute(boolean z) {
        org.webrtc.voiceengine.WebRtcAudioTrack.setSpeakerMute(z);
    }

    @Override
    public void release() {
    }
}
