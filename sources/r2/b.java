package r2;

import android.os.HandlerThread;
public final class b implements e9.t {
    public final int f47224a;
    public final int f47225b;

    public b(int i10, int i11) {
        this.f47224a = i11;
        this.f47225b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f47224a) {
            case 0:
                return new HandlerThread(c.b(this.f47225b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.b(this.f47225b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
