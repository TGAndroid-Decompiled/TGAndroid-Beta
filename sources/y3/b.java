package y3;

import android.os.HandlerThread;
public final class b implements n8.i {
    public final int f49467a;
    public final int f49468b;

    public b(int i9, int i10) {
        this.f49467a = i10;
        this.f49468b = i9;
    }

    @Override
    public final Object get() {
        switch (this.f49467a) {
            case 0:
                return new HandlerThread(c.j(this.f49468b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.j(this.f49468b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
