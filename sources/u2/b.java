package u2;

import android.os.HandlerThread;
public final class b implements g9.t {
    public final int f58423a;
    public final int f58424b;

    public b(int i7, int i10) {
        this.f58423a = i10;
        this.f58424b = i7;
    }

    @Override
    public final Object get() {
        switch (this.f58423a) {
            case 0:
                return new HandlerThread(c.b(this.f58424b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.b(this.f58424b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
