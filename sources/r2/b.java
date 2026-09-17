package r2;

import android.os.HandlerThread;
public final class b implements d9.i {
    public final int f41950a;
    public final int f41951b;

    public b(int i10, int i11) {
        this.f41950a = i11;
        this.f41951b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f41950a) {
            case 0:
                return new HandlerThread(c.m(this.f41951b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f41951b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
