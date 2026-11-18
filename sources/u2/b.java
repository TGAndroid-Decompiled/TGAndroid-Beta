package u2;

import android.os.HandlerThread;
public final class b implements g9.t {
    public final int f58298a;
    public final int f58299b;

    public b(int i7, int i10) {
        this.f58298a = i10;
        this.f58299b = i7;
    }

    @Override
    public final Object get() {
        switch (this.f58298a) {
            case 0:
                return new HandlerThread(c.p(this.f58299b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.f58299b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
