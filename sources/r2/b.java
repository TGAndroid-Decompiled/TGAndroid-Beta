package r2;

import android.os.HandlerThread;
public final class b implements d9.i {
    public final int f42213a;
    public final int f42214b;

    public b(int i10, int i11) {
        this.f42213a = i11;
        this.f42214b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f42213a) {
            case 0:
                return new HandlerThread(c.m(this.f42214b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f42214b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
