package u2;

import android.os.HandlerThread;
public final class b implements g9.u {
    public final int f56131a;
    public final int f56132b;

    public b(int i7, int i10) {
        this.f56131a = i10;
        this.f56132b = i7;
    }

    @Override
    public final Object get() {
        switch (this.f56131a) {
            case 0:
                return new HandlerThread(c.p(this.f56132b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.f56132b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
