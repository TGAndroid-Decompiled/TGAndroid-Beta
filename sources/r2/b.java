package r2;

import android.os.HandlerThread;
public final class b implements d9.i {
    public final int f41880a;
    public final int f41881b;

    public b(int i10, int i11) {
        this.f41880a = i11;
        this.f41881b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f41880a) {
            case 0:
                return new HandlerThread(c.m(this.f41881b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f41881b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
