package org.webrtc;
public class MediaSource {
    private long nativeSource;
    private final RefCountDelegate refCountDelegate;

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
        this.refCountDelegate = new RefCountDelegate(new px6((byte) 0, j));
        this.nativeSource = j;
    }

    private void checkMediaSourceExists() {
        if (this.nativeSource != 0) {
            return;
        }
        sc8.j("MediaSource has been disposed.");
    }

    private static native State nativeGetState(long j);

    public void dispose() {
        checkMediaSourceExists();
        this.refCountDelegate.release();
        this.nativeSource = 0L;
    }

    public long getNativeMediaSource() {
        checkMediaSourceExists();
        return this.nativeSource;
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
        checkMediaSourceExists();
        return nativeGetState(this.nativeSource);
    }
}
