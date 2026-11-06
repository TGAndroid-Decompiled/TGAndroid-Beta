package u2;

import android.os.HandlerThread;
public final class b implements g9.u {
    public final int f56106a;
    public final int f56107b;

    public b(int i7, int i10) {
        this.f56106a = i10;
        this.f56107b = i7;
    }

    @Override
    public final Object get() {
        switch (this.f56106a) {
            case 0:
                return new HandlerThread(c.p(this.f56107b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.f56107b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
