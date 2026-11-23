package u2;

import android.os.HandlerThread;
public final class b implements g9.t {
    public final int f58308a;
    public final int f58309b;

    public b(int i7, int i10) {
        this.f58308a = i10;
        this.f58309b = i7;
    }

    @Override
    public final Object get() {
        switch (this.f58308a) {
            case 0:
                return new HandlerThread(c.p(this.f58309b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.f58309b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
