package u2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
public final class a implements MediaCodec.OnFrameRenderedListener {
    public final int f56218a;
    public final d3.k f56219b;

    public a(l lVar, d3.k kVar, int i7) {
        this.f56218a = i7;
        this.f56219b = kVar;
    }

    @Override
    public final void onFrameRendered(MediaCodec mediaCodec, long j3, long j10) {
        switch (this.f56218a) {
            case 0:
                d3.k kVar = this.f56219b;
                Handler handler = kVar.f8030a;
                if (Build.VERSION.SDK_INT < 30) {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j3 >> 32), (int) j3));
                    return;
                } else {
                    kVar.a(j3);
                    return;
                }
            default:
                d3.k kVar2 = this.f56219b;
                Handler handler2 = kVar2.f8030a;
                if (Build.VERSION.SDK_INT < 30) {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j3 >> 32), (int) j3));
                    return;
                } else {
                    kVar2.a(j3);
                    return;
                }
        }
    }
}
