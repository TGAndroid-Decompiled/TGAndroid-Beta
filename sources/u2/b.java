package u2;

import android.os.HandlerThread;
public final class b implements g9.u {
    public final int f56231a;
    public final int f56232b;

    public b(int i7, int i10) {
        this.f56231a = i10;
        this.f56232b = i7;
    }

    @Override
    public final Object get() {
        switch (this.f56231a) {
            case 0:
                return new HandlerThread(c.p(this.f56232b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.f56232b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
