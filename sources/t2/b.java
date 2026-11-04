package t2;

import android.os.HandlerThread;
public final class b implements f9.t {
    public final int f54812a;
    public final int f54813b;

    public b(int i3, int i10) {
        this.f54812a = i10;
        this.f54813b = i3;
    }

    @Override
    public final Object get() {
        switch (this.f54812a) {
            case 0:
                return new HandlerThread(c.p(this.f54813b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.f54813b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
