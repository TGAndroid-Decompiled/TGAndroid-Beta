package r2;

import android.os.HandlerThread;
public final class b implements d9.i {
    public final int f41147a;
    public final int f41148b;

    public b(int i10, int i11) {
        this.f41147a = i11;
        this.f41148b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f41147a) {
            case 0:
                return new HandlerThread(c.m(this.f41148b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f41148b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
