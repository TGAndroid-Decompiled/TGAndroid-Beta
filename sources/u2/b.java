package u2;

import android.os.HandlerThread;
public final class b implements g9.t {
    public final int f58297a;
    public final int f58298b;

    public b(int i7, int i10) {
        this.f58297a = i10;
        this.f58298b = i7;
    }

    @Override
    public final Object get() {
        switch (this.f58297a) {
            case 0:
                return new HandlerThread(c.p(this.f58298b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.f58298b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
