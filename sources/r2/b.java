package r2;

import android.os.HandlerThread;
public final class b implements d9.i {
    public final int f42199a;
    public final int f42200b;

    public b(int i10, int i11) {
        this.f42199a = i11;
        this.f42200b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f42199a) {
            case 0:
                return new HandlerThread(c.m(this.f42200b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f42200b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
