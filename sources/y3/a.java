package y3;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import d5.g0;

public final class a implements MediaCodec.OnFrameRenderedListener {

    public final int f49455a;

    public final e5.h f49456b;

    public a(k kVar, e5.h hVar, int i10) {
        this.f49455a = i10;
        this.f49456b = hVar;
    }

    @Override
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        switch (this.f49455a) {
            case 0:
                e5.h hVar = this.f49456b;
                Handler handler = hVar.f5248a;
                if (g0.f4795a >= 30) {
                    hVar.a(j10);
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j10 >> 32), (int) j10));
                }
                break;
            default:
                e5.h hVar2 = this.f49456b;
                Handler handler2 = hVar2.f5248a;
                if (g0.f4795a >= 30) {
                    hVar2.a(j10);
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j10 >> 32), (int) j10));
                }
                break;
        }
    }
}
