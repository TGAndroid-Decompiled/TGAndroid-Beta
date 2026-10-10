package r2;

import android.os.HandlerThread;
public final class b implements d9.j {
    public final int f46900a;
    public final int f46901b;

    public b(int i10, int i11) {
        this.f46900a = i11;
        this.f46901b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f46900a) {
            case 0:
                return new HandlerThread(c.m(this.f46901b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f46901b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
