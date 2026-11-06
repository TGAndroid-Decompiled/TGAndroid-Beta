package u2;

import android.os.HandlerThread;
public final class b implements g9.u {
    public final int f56130a;
    public final int f56131b;

    public b(int i7, int i10) {
        this.f56130a = i10;
        this.f56131b = i7;
    }

    @Override
    public final Object get() {
        switch (this.f56130a) {
            case 0:
                return new HandlerThread(c.p(this.f56131b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.f56131b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
