package r2;

import android.os.HandlerThread;
public final class b implements d9.u {
    public final int f44906a;
    public final int f44907b;

    public b(int i10, int i11) {
        this.f44906a = i11;
        this.f44907b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f44906a) {
            case 0:
                return new HandlerThread(c.p(this.f44907b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.f44907b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
