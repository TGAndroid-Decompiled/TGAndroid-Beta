package r2;

import android.os.HandlerThread;
public final class b implements d9.j {
    public final int f44821a;
    public final int f44822b;

    public b(int i10, int i11) {
        this.f44821a = i11;
        this.f44822b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f44821a) {
            case 0:
                return new HandlerThread(c.m(this.f44822b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.m(this.f44822b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
