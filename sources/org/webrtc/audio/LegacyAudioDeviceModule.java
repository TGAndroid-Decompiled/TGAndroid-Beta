package org.webrtc.audio;
@Deprecated
public class LegacyAudioDeviceModule implements AudioDeviceModule {
    @Override
    public long getNativeAudioDeviceModulePointer() {
        return 0L;
    }

    @Override
    public void setMicrophoneMute(boolean z10) {
        org.webrtc.voiceengine.WebRtcAudioRecord.setMicrophoneMute(z10);
    }

    @Override
    public final boolean setNoiseSuppressorEnabled(boolean z10) {
        return a.a(this, z10);
    }

    @Override
    public final boolean setPreferredMicrophoneFieldDimension(float f9) {
        return a.b(this, f9);
    }

    @Override
    public void setSpeakerMute(boolean z10) {
        org.webrtc.voiceengine.WebRtcAudioTrack.setSpeakerMute(z10);
    }

    @Override
    public void release() {
    }
}
