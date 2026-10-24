package r2;

import android.os.HandlerThread;
public final class b implements d9.u {
    public final int f45321a;
    public final int f45322b;

    public b(int i10, int i11) {
        this.f45321a = i11;
        this.f45322b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f45321a) {
            case 0:
                return new HandlerThread(c.p(this.f45322b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.f45322b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
