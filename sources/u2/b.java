package u2;

import android.os.HandlerThread;
public final class b implements g9.t {
    public final int f58339a;
    public final int f58340b;

    public b(int i7, int i10) {
        this.f58339a = i10;
        this.f58340b = i7;
    }

    @Override
    public final Object get() {
        switch (this.f58339a) {
            case 0:
                return new HandlerThread(c.p(this.f58340b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.f58340b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
