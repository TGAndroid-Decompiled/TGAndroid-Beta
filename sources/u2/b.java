package u2;

import android.os.HandlerThread;
public final class b implements g9.u {
    public final int f56220a;
    public final int f56221b;

    public b(int i7, int i10) {
        this.f56220a = i10;
        this.f56221b = i7;
    }

    @Override
    public final Object get() {
        switch (this.f56220a) {
            case 0:
                return new HandlerThread(c.p(this.f56221b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.f56221b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
