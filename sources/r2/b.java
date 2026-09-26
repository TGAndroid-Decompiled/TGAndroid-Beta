package r2;

import android.os.HandlerThread;
public final class b implements d9.i {
    public final int f42212a;
    public final int f42213b;

    public b(int i10, int i11) {
        this.f42212a = i11;
        this.f42213b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f42212a) {
            case 0:
                return new HandlerThread(c.m(this.f42213b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f42213b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
