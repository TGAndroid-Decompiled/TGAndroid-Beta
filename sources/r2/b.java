package r2;

import android.os.HandlerThread;
public final class b implements d9.i {
    public final int f41955a;
    public final int f41956b;

    public b(int i10, int i11) {
        this.f41955a = i11;
        this.f41956b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f41955a) {
            case 0:
                return new HandlerThread(c.m(this.f41956b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f41956b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
