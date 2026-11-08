package u2;

import android.os.HandlerThread;
public final class b implements g9.u {
    public final int f56219a;
    public final int f56220b;

    public b(int i7, int i10) {
        this.f56219a = i10;
        this.f56220b = i7;
    }

    @Override
    public final Object get() {
        switch (this.f56219a) {
            case 0:
                return new HandlerThread(c.p(this.f56220b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.f56220b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
