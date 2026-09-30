package r2;

import android.os.HandlerThread;
public final class b implements d9.i {
    public final int f42318a;
    public final int f42319b;

    public b(int i10, int i11) {
        this.f42318a = i11;
        this.f42319b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f42318a) {
            case 0:
                return new HandlerThread(c.m(this.f42319b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f42319b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
