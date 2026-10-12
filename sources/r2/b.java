package r2;

import android.os.HandlerThread;
public final class b implements d9.u {
    public final int f43809a;
    public final int f43810b;

    public b(int i10, int i11) {
        this.f43809a = i11;
        this.f43810b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f43809a) {
            case 0:
                return new HandlerThread(c.c(this.f43810b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.c(this.f43810b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
