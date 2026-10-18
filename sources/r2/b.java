package r2;

import android.os.HandlerThread;
public final class b implements d9.u {
    public final int f44944a;
    public final int f44945b;

    public b(int i10, int i11) {
        this.f44944a = i11;
        this.f44945b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f44944a) {
            case 0:
                return new HandlerThread(c.p(this.f44945b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.f44945b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
