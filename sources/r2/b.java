package r2;

import android.os.HandlerThread;
public final class b implements d9.u {
    public final int f44896a;
    public final int f44897b;

    public b(int i10, int i11) {
        this.f44896a = i11;
        this.f44897b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f44896a) {
            case 0:
                return new HandlerThread(c.p(this.f44897b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.f44897b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
