package r2;

import android.os.HandlerThread;
public final class b implements d9.u {
    public final int f44910a;
    public final int f44911b;

    public b(int i10, int i11) {
        this.f44910a = i11;
        this.f44911b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f44910a) {
            case 0:
                return new HandlerThread(c.p(this.f44911b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.f44911b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
