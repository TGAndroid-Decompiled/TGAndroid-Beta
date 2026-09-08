package r2;

import android.os.HandlerThread;
public final class b implements d9.j {
    public final int f44820a;
    public final int f44821b;

    public b(int i10, int i11) {
        this.f44820a = i11;
        this.f44821b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f44820a) {
            case 0:
                return new HandlerThread(c.m(this.f44821b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f44821b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
