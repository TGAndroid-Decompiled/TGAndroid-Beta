package r2;

import android.os.HandlerThread;
public final class b implements d9.j {
    public final int f46980a;
    public final int f46981b;

    public b(int i10, int i11) {
        this.f46980a = i11;
        this.f46981b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f46980a) {
            case 0:
                return new HandlerThread(c.m(this.f46981b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f46981b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
