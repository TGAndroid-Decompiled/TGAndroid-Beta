package r2;

import android.os.HandlerThread;
public final class b implements d9.j {
    public final int f42248a;
    public final int f42249b;

    public b(int i10, int i11) {
        this.f42248a = i11;
        this.f42249b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f42248a) {
            case 0:
                return new HandlerThread(c.m(this.f42249b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f42249b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
