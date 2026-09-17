package r2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
public final class a implements MediaCodec.OnFrameRenderedListener {
    public final int f44791a;
    public final a3.l f44792b;

    public a(l lVar, a3.l lVar2, int i10) {
        this.f44791a = i10;
        this.f44792b = lVar2;
    }

    @Override
    public final void onFrameRendered(MediaCodec mediaCodec, long j3, long j10) {
        switch (this.f44791a) {
            case 0:
                a3.l lVar = this.f44792b;
                Handler handler = lVar.f133a;
                if (Build.VERSION.SDK_INT < 30) {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j3 >> 32), (int) j3));
                    return;
                } else {
                    lVar.a(j3);
                    return;
                }
            default:
                a3.l lVar2 = this.f44792b;
                Handler handler2 = lVar2.f133a;
                if (Build.VERSION.SDK_INT < 30) {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j3 >> 32), (int) j3));
                    return;
                } else {
                    lVar2.a(j3);
                    return;
                }
        }
    }
}
