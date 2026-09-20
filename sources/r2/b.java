package r2;

import android.os.HandlerThread;
public final class b implements d9.i {
    public final int f42227a;
    public final int f42228b;

    public b(int i10, int i11) {
        this.f42227a = i11;
        this.f42228b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f42227a) {
            case 0:
                return new HandlerThread(c.m(this.f42228b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f42228b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
