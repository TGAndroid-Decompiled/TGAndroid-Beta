package t2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
public final class a implements MediaCodec.OnFrameRenderedListener {
    public final int f54810a;
    public final c3.k f54811b;

    public a(l lVar, c3.k kVar, int i3) {
        this.f54810a = i3;
        this.f54811b = kVar;
    }

    @Override
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        switch (this.f54810a) {
            case 0:
                c3.k kVar = this.f54811b;
                Handler handler = kVar.f4055a;
                if (Build.VERSION.SDK_INT < 30) {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j10 >> 32), (int) j10));
                    return;
                } else {
                    kVar.a(j10);
                    return;
                }
            default:
                c3.k kVar2 = this.f54811b;
                Handler handler2 = kVar2.f4055a;
                if (Build.VERSION.SDK_INT < 30) {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j10 >> 32), (int) j10));
                    return;
                } else {
                    kVar2.a(j10);
                    return;
                }
        }
    }
}
