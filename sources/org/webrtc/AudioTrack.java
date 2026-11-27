package org.webrtc;

import org.webrtc.AudioTrack;
import org.webrtc.NativeLifecycleLock;
public class AudioTrack extends MediaStreamTrack {

    public interface Natives {
        void setVolume(long j, double d);
    }

    public AudioTrack(long j) {
        super(j);
    }

    public static void lambda$setVolume$0(double d, long j) {
        AudioTrackJni.get().setVolume(j, d);
    }

    public long getNativeAudioTrack() {
        return getNativeMediaStreamTrack();
    }

    public void setVolume(final double d) {
        this.lifecycleLock.run(new NativeLifecycleLock.NativePointerRunnable() {
            @Override
            public final void run(long j) {
                AudioTrack.lambda$setVolume$0(d, j);
            }
        });
    }
}
