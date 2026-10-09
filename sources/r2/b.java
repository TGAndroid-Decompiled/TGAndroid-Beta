package r2;

import android.os.HandlerThread;
public final class b implements d9.j {
    public final int f46854a;
    public final int f46855b;

    public b(int i10, int i11) {
        this.f46854a = i11;
        this.f46855b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f46854a) {
            case 0:
                return new HandlerThread(c.m(this.f46855b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f46855b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
