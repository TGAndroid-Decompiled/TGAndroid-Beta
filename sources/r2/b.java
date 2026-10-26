package r2;

import android.os.HandlerThread;
public final class b implements e9.t {
    public final int f47189a;
    public final int f47190b;

    public b(int i10, int i11) {
        this.f47189a = i11;
        this.f47190b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f47189a) {
            case 0:
                return new HandlerThread(c.b(this.f47190b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.b(this.f47190b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
