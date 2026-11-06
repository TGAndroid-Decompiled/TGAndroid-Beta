package org.webrtc.audio;
@Deprecated
public class LegacyAudioDeviceModule implements AudioDeviceModule {
    @Override
    public long getNativeAudioDeviceModulePointer() {
        return 0L;
    }

    @Override
    public void setMicrophoneMute(boolean z9) {
        org.webrtc.voiceengine.WebRtcAudioRecord.setMicrophoneMute(z9);
    }

    @Override
    public final boolean setNoiseSuppressorEnabled(boolean z9) {
        return a.a(this, z9);
    }

    @Override
    public final boolean setPreferredMicrophoneFieldDimension(float f10) {
        return a.b(this, f10);
    }

    @Override
    public void setSpeakerMute(boolean z9) {
        org.webrtc.voiceengine.WebRtcAudioTrack.setSpeakerMute(z9);
    }

    @Override
    public void release() {
    }
}
