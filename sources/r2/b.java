package r2;

import android.os.HandlerThread;
public final class b implements d9.u {
    public final int f45322a;
    public final int f45323b;

    public b(int i10, int i11) {
        this.f45322a = i11;
        this.f45323b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f45322a) {
            case 0:
                return new HandlerThread(c.p(this.f45323b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.f45323b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
