package r2;

import android.os.HandlerThread;
public final class b implements d9.i {
    public final int f41928a;
    public final int f41929b;

    public b(int i10, int i11) {
        this.f41928a = i11;
        this.f41929b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f41928a) {
            case 0:
                return new HandlerThread(c.m(this.f41929b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f41929b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
