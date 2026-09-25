package r2;

import android.os.HandlerThread;
public final class b implements d9.i {
    public final int f42214a;
    public final int f42215b;

    public b(int i10, int i11) {
        this.f42214a = i11;
        this.f42215b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f42214a) {
            case 0:
                return new HandlerThread(c.m(this.f42215b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f42215b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
