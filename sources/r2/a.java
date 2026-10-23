package r2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
public final class a implements MediaCodec.OnFrameRenderedListener {
    public final int f44908a;
    public final a3.m f44909b;

    public a(l lVar, a3.m mVar, int i10) {
        this.f44908a = i10;
        this.f44909b = mVar;
    }

    @Override
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        switch (this.f44908a) {
            case 0:
                a3.m mVar = this.f44909b;
                Handler handler = mVar.f145a;
                if (Build.VERSION.SDK_INT < 30) {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j10 >> 32), (int) j10));
                    return;
                } else {
                    mVar.a(j10);
                    return;
                }
            default:
                a3.m mVar2 = this.f44909b;
                Handler handler2 = mVar2.f145a;
                if (Build.VERSION.SDK_INT < 30) {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j10 >> 32), (int) j10));
                    return;
                } else {
                    mVar2.a(j10);
                    return;
                }
        }
    }
}
