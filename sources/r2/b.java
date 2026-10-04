package r2;

import android.os.HandlerThread;
public final class b implements d9.i {
    public final int f45690a;
    public final int f45691b;

    public b(int i10, int i11) {
        this.f45690a = i11;
        this.f45691b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f45690a) {
            case 0:
                return new HandlerThread(c.m(this.f45691b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f45691b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
