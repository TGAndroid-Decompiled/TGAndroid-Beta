package r2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
public final class a implements MediaCodec.OnFrameRenderedListener {
    public final int f46944a;
    public final a3.m f46945b;

    public a(m mVar, a3.m mVar2, int i10) {
        this.f46944a = i10;
        this.f46945b = mVar2;
    }

    @Override
    public final void onFrameRendered(MediaCodec mediaCodec, long j3, long j10) {
        switch (this.f46944a) {
            case 0:
                a3.m mVar = this.f46945b;
                Handler handler = mVar.f158a;
                if (Build.VERSION.SDK_INT < 30) {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j3 >> 32), (int) j3));
                    return;
                } else {
                    mVar.a(j3);
                    return;
                }
            default:
                a3.m mVar2 = this.f46945b;
                Handler handler2 = mVar2.f158a;
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
