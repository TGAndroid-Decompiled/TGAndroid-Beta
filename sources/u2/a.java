package u2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
public final class a implements MediaCodec.OnFrameRenderedListener {
    public final int f56230a;
    public final d3.k f56231b;

    public a(l lVar, d3.k kVar, int i7) {
        this.f56230a = i7;
        this.f56231b = kVar;
    }

    @Override
    public final void onFrameRendered(MediaCodec mediaCodec, long j3, long j10) {
        switch (this.f56230a) {
            case 0:
                d3.k kVar = this.f56231b;
                Handler handler = kVar.f8028a;
                if (Build.VERSION.SDK_INT < 30) {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j3 >> 32), (int) j3));
                    return;
                } else {
                    kVar.a(j3);
                    return;
                }
            default:
                d3.k kVar2 = this.f56231b;
                Handler handler2 = kVar2.f8028a;
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
