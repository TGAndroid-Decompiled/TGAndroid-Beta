package r2;

import android.os.HandlerThread;
public final class b implements d9.t {
    public final int f46205a;
    public final int f46206b;

    public b(int i10, int i11) {
        this.f46205a = i11;
        this.f46206b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f46205a) {
            case 0:
                return new HandlerThread(c.p(this.f46206b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.f46206b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
