package r2;

import android.os.HandlerThread;
public final class b implements d9.i {
    public final int f45698a;
    public final int f45699b;

    public b(int i10, int i11) {
        this.f45698a = i11;
        this.f45699b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f45698a) {
            case 0:
                return new HandlerThread(c.m(this.f45699b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f45699b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
