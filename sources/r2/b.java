package r2;

import android.os.HandlerThread;
public final class b implements d9.j {
    public final int f46856a;
    public final int f46857b;

    public b(int i10, int i11) {
        this.f46856a = i11;
        this.f46857b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f46856a) {
            case 0:
                return new HandlerThread(c.m(this.f46857b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f46857b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
