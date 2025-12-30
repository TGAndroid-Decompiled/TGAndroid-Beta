package org.webrtc;

public class AudioSource extends MediaSource {
    public AudioSource(long j) {
        super(j);
    }

    long getNativeAudioSource() {
        return getNativeMediaSource();
    }
}
