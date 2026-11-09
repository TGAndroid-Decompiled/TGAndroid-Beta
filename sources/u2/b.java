package u2;

import android.os.HandlerThread;
public final class b implements g9.u {
    public final int f56232a;
    public final int f56233b;

    public b(int i7, int i10) {
        this.f56232a = i10;
        this.f56233b = i7;
    }

    @Override
    public final Object get() {
        switch (this.f56232a) {
            case 0:
                return new HandlerThread(c.p(this.f56233b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.f56233b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
