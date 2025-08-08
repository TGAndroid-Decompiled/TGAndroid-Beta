package org.webrtc.audio;

import org.webrtc.audio.AudioDeviceModule;

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
    public boolean setNoiseSuppressorEnabled(boolean z) {
        return AudioDeviceModule.CC.$default$setNoiseSuppressorEnabled(this, z);
    }

    @Override
    public boolean setPreferredMicrophoneFieldDimension(float f) {
        return AudioDeviceModule.CC.$default$setPreferredMicrophoneFieldDimension(this, f);
    }

    @Override
    public void setSpeakerMute(boolean z) {
        org.webrtc.voiceengine.WebRtcAudioTrack.setSpeakerMute(z);
    }

    @Override
    public void setMicrophoneMute(boolean z) {
        org.webrtc.voiceengine.WebRtcAudioRecord.setMicrophoneMute(z);
    }
}
