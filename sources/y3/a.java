package y3;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import d5.f0;
public final class a implements MediaCodec.OnFrameRenderedListener {
    public final int f49465a;
    public final e5.i f49466b;

    public a(k kVar, e5.i iVar, int i9) {
        this.f49465a = i9;
        this.f49466b = iVar;
    }

    @Override
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        switch (this.f49465a) {
            case 0:
                e5.i iVar = this.f49466b;
                Handler handler = iVar.f4891a;
                if (f0.f4349a < 30) {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j10 >> 32), (int) j10));
                    return;
                } else {
                    iVar.a(j10);
                    return;
                }
            default:
                e5.i iVar2 = this.f49466b;
                Handler handler2 = iVar2.f4891a;
                if (f0.f4349a < 30) {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j10 >> 32), (int) j10));
                    return;
                } else {
                    iVar2.a(j10);
                    return;
                }
        }
    }
}
