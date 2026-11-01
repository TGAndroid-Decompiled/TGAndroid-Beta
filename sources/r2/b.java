package r2;

import android.os.HandlerThread;
public final class b implements d9.t {
    public final int f46216a;
    public final int f46217b;

    public b(int i10, int i11) {
        this.f46216a = i11;
        this.f46217b = i10;
    }

    @Override
    public final Object get() {
        switch (this.f46216a) {
            case 0:
                return new HandlerThread(c.p(this.f46217b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.f46217b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
