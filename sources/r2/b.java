package r2;

import android.os.HandlerThread;
public final class b implements d9.j {
    public final int f47071a;
    public final int f47072b;

    public b(int i10, int i11) {
        this.f47071a = i11;
        this.f47072b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f47071a) {
            case 0:
                return new HandlerThread(c.m(this.f47072b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f47072b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
