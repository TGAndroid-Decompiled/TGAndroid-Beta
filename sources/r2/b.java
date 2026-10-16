package r2;

import android.os.HandlerThread;
public final class b implements d9.u {
    public final int f43568a;
    public final int f43569b;

    public b(int i10, int i11) {
        this.f43568a = i11;
        this.f43569b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f43568a) {
            case 0:
                return new HandlerThread(c.c(this.f43569b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.c(this.f43569b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
