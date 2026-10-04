package r2;

import android.os.HandlerThread;
public final class b implements d9.i {
    public final int f45691a;
    public final int f45692b;

    public b(int i10, int i11) {
        this.f45691a = i11;
        this.f45692b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f45691a) {
            case 0:
                return new HandlerThread(c.m(this.f45692b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f45692b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
