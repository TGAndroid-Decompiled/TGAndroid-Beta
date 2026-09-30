package r2;

import android.os.HandlerThread;
public final class b implements d9.i {
    public final int f42215a;
    public final int f42216b;

    public b(int i10, int i11) {
        this.f42215a = i11;
        this.f42216b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f42215a) {
            case 0:
                return new HandlerThread(c.m(this.f42216b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f42216b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
