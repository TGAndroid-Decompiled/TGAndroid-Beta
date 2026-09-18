package r2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
public final class a implements MediaCodec.OnFrameRenderedListener {
    public final int f42181a;
    public final a3.m f42182b;

    public a(l lVar, a3.m mVar, int i10) {
        this.f42181a = i10;
        this.f42182b = mVar;
    }

    @Override
    public final void onFrameRendered(MediaCodec mediaCodec, long j3, long j10) {
        switch (this.f42181a) {
            case 0:
                a3.m mVar = this.f42182b;
                Handler handler = mVar.f145a;
                if (Build.VERSION.SDK_INT < 30) {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j3 >> 32), (int) j3));
                    return;
                } else {
                    mVar.a(j3);
                    return;
                }
            default:
                a3.m mVar2 = this.f42182b;
                Handler handler2 = mVar2.f145a;
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
