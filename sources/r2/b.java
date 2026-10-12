package r2;

import android.os.HandlerThread;
public final class b implements d9.j {
    public final int f47079a;
    public final int f47080b;

    public b(int i10, int i11) {
        this.f47079a = i11;
        this.f47080b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f47079a) {
            case 0:
                return new HandlerThread(c.m(this.f47080b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f47080b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
