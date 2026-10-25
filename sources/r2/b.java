package r2;

import android.os.HandlerThread;
public final class b implements e9.t {
    public final int f47186a;
    public final int f47187b;

    public b(int i10, int i11) {
        this.f47186a = i11;
        this.f47187b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f47186a) {
            case 0:
                return new HandlerThread(c.b(this.f47187b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.b(this.f47187b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
