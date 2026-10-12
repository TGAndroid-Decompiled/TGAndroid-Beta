package org.webrtc;
public class AudioSource extends MediaSource {
    public AudioSource(long j10) {
        super(j10);
    }

    public long getNativeAudioSource() {
        return getNativeMediaSource();
    }
}
