package y3;

import android.os.HandlerThread;

public final class b implements o8.i {

    public final int f49457a;

    public final int f49458b;

    public b(int i10, int i11) {
        this.f49457a = i11;
        this.f49458b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f49457a) {
            case 0:
                return new HandlerThread(c.j(this.f49458b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.j(this.f49458b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
