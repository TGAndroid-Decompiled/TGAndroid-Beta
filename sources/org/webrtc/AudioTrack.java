package org.webrtc;
public class AudioTrack extends MediaStreamTrack {
    public AudioTrack(long j10) {
        super(j10);
    }

    private static native void nativeSetVolume(long j10, double d);

    public long getNativeAudioTrack() {
        return getNativeMediaStreamTrack();
    }

    public void setVolume(double d) {
        nativeSetVolume(getNativeAudioTrack(), d);
    }
}
