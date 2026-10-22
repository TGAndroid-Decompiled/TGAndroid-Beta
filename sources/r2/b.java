package r2;

import android.os.HandlerThread;
public final class b implements d9.u {
    public final int f44909a;
    public final int f44910b;

    public b(int i10, int i11) {
        this.f44909a = i11;
        this.f44910b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f44909a) {
            case 0:
                return new HandlerThread(c.p(this.f44910b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.f44910b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
