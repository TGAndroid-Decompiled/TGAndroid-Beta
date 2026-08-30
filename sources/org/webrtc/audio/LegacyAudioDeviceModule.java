package org.webrtc.audio;
@Deprecated
public class LegacyAudioDeviceModule implements AudioDeviceModule {
    @Override
    public long getNativeAudioDeviceModulePointer() {
        return 0L;
    }

    @Override
    public void setMicrophoneMute(boolean z4) {
        org.webrtc.voiceengine.WebRtcAudioRecord.setMicrophoneMute(z4);
    }

    @Override
    public final boolean setNoiseSuppressorEnabled(boolean z4) {
        return a.a(this, z4);
    }

    @Override
    public final boolean setPreferredMicrophoneFieldDimension(float f10) {
        return a.b(this, f10);
    }

    @Override
    public void setSpeakerMute(boolean z4) {
        org.webrtc.voiceengine.WebRtcAudioTrack.setSpeakerMute(z4);
    }

    @Override
    public void release() {
    }
}
