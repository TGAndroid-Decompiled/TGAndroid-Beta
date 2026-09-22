package r2;

import android.os.HandlerThread;
public final class b implements d9.i {
    public final int f41924a;
    public final int f41925b;

    public b(int i10, int i11) {
        this.f41924a = i11;
        this.f41925b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f41924a) {
            case 0:
                return new HandlerThread(c.m(this.f41925b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f41925b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
