package u2;

import android.os.HandlerThread;
public final class b implements g9.t {
    public final int f57730a;
    public final int f57731b;

    public b(int i7, int i10) {
        this.f57730a = i10;
        this.f57731b = i7;
    }

    @Override
    public final Object get() {
        switch (this.f57730a) {
            case 0:
                return new HandlerThread(c.b(this.f57731b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.b(this.f57731b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
