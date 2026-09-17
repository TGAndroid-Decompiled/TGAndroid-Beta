package r2;

import android.os.HandlerThread;
public final class b implements d9.j {
    public final int f44793a;
    public final int f44794b;

    public b(int i10, int i11) {
        this.f44793a = i11;
        this.f44794b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f44793a) {
            case 0:
                return new HandlerThread(c.m(this.f44794b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f44794b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
