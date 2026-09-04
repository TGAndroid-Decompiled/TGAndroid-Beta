package r2;

import android.os.HandlerThread;
public final class b implements d9.j {
    public final int f44792a;
    public final int f44793b;

    public b(int i10, int i11) {
        this.f44792a = i11;
        this.f44793b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f44792a) {
            case 0:
                return new HandlerThread(c.m(this.f44793b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f44793b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
