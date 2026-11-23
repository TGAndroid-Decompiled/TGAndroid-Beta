package u2;

import android.os.HandlerThread;
public final class b implements g9.t {
    public final int f58343a;
    public final int f58344b;

    public b(int i7, int i10) {
        this.f58343a = i10;
        this.f58344b = i7;
    }

    @Override
    public final Object get() {
        switch (this.f58343a) {
            case 0:
                return new HandlerThread(c.p(this.f58344b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.f58344b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
