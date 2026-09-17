package r2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
public final class a implements MediaCodec.OnFrameRenderedListener {
    public final int f44819a;
    public final a3.m f44820b;

    public a(l lVar, a3.m mVar, int i10) {
        this.f44819a = i10;
        this.f44820b = mVar;
    }

    @Override
    public final void onFrameRendered(MediaCodec mediaCodec, long j3, long j10) {
        switch (this.f44819a) {
            case 0:
                a3.m mVar = this.f44820b;
                Handler handler = mVar.f156a;
                if (Build.VERSION.SDK_INT < 30) {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j3 >> 32), (int) j3));
                    return;
                } else {
                    mVar.a(j3);
                    return;
                }
            default:
                a3.m mVar2 = this.f44820b;
                Handler handler2 = mVar2.f156a;
                if (Build.VERSION.SDK_INT < 30) {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j3 >> 32), (int) j3));
                    return;
                } else {
                    mVar2.a(j3);
                    return;
                }
        }
    }
}
