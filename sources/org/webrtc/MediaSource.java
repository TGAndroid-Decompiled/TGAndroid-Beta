package org.webrtc;
public class MediaSource {
    final NativeLifecycleLock lifecycleLock;
    private final RefCountDelegate refCountDelegate;

    public interface Natives {
        State getState(long j);
    }

    public enum State {
        INITIALIZING,
        LIVE,
        ENDED,
        MUTED;

        public static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public MediaSource(long j) {
        this.refCountDelegate = new RefCountDelegate(new tz6((byte) 0, j));
        this.lifecycleLock = new NativeLifecycleLock("MediaSource", j);
    }

    public static State c(long j) {
        return lambda$state$1(j);
    }

    public void lambda$dispose$2(long j) {
        this.refCountDelegate.release();
    }

    public static State lambda$state$1(long j) {
        return MediaSourceJni.get().getState(j);
    }

    public void dispose() {
        this.lifecycleLock.dispose(new bm6(this, (byte) 9));
    }

    public long getNativeMediaSource() {
        return this.lifecycleLock.getNativePointer();
    }

    public void runWithReference(Runnable runnable) {
        if (this.refCountDelegate.safeRetain()) {
            try {
                runnable.run();
            } finally {
                this.refCountDelegate.release();
            }
        }
    }

    public State state() {
        return (State) this.lifecycleLock.call(new hz6((byte) 5));
    }
}
