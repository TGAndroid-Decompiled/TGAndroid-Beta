package r2;

import android.os.HandlerThread;
public final class b implements d9.i {
    public final int f45705a;
    public final int f45706b;

    public b(int i10, int i11) {
        this.f45705a = i11;
        this.f45706b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f45705a) {
            case 0:
                return new HandlerThread(c.m(this.f45706b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f45706b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
