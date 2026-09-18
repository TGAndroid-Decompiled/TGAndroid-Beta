package r2;

import android.os.HandlerThread;
public final class b implements d9.i {
    public final int f42183a;
    public final int f42184b;

    public b(int i10, int i11) {
        this.f42183a = i11;
        this.f42184b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f42183a) {
            case 0:
                return new HandlerThread(c.m(this.f42184b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f42184b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
