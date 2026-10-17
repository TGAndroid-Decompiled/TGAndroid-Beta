package r2;

import android.os.HandlerThread;
public final class b implements d9.u {
    public final int f44924a;
    public final int f44925b;

    public b(int i10, int i11) {
        this.f44924a = i11;
        this.f44925b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f44924a) {
            case 0:
                return new HandlerThread(c.p(this.f44925b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.f44925b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
