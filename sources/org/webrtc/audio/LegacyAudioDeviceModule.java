package org.webrtc.audio;

import org.webrtc.voiceengine.WebRtcAudioRecord;
import org.webrtc.voiceengine.WebRtcAudioTrack;

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
    public void setSpeakerMute(boolean z) {
        WebRtcAudioTrack.setSpeakerMute(z);
    }

    @Override
    public void setMicrophoneMute(boolean z) {
        WebRtcAudioRecord.setMicrophoneMute(z);
    }
}
