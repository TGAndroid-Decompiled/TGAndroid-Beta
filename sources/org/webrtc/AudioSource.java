package org.webrtc;
public class AudioSource extends MediaSource {
    public AudioSource(long j3) {
        super(j3);
    }

    public long getNativeAudioSource() {
        return getNativeMediaSource();
    }
}
