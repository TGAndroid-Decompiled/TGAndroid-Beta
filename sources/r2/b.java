package r2;

import android.os.HandlerThread;
public final class b implements d9.j {
    public final int f46946a;
    public final int f46947b;

    public b(int i10, int i11) {
        this.f46946a = i11;
        this.f46947b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f46946a) {
            case 0:
                return new HandlerThread(c.m(this.f46947b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f46947b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
