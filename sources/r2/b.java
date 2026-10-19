package r2;

import android.os.HandlerThread;
public final class b implements d9.u {
    public final int f44898a;
    public final int f44899b;

    public b(int i10, int i11) {
        this.f44898a = i11;
        this.f44899b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f44898a) {
            case 0:
                return new HandlerThread(c.p(this.f44899b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.f44899b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
