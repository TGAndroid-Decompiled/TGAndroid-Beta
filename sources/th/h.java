package th;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.ij;
import org.telegram.messenger.t5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.l6;
public final class h extends sh.d {
    public final TLRPC.Document f56075b;
    public final Object f56076c;

    public h(Object obj, TLRPC.Document document) {
        boolean z9;
        this.f56075b = document;
        this.f56076c = obj;
        ij.H2(document);
        ImageReceiver imageReceiver = this.f55306a;
        if (!ij.u4(document) && !ij.N4(document)) {
            z9 = false;
        } else {
            z9 = true;
        }
        ij.K2(document, true);
        imageReceiver.p0(hc.b(document), "38_38", t5.f(document, l6.Zc, 1.0f, null), document.size, z9 ? "webp" : null, obj, 0);
    }

    @Override
    public final void c(Canvas canvas, int i7, int i10) {
        ImageReceiver imageReceiver = this.f55306a;
        imageReceiver.y0(0.0f, 0.0f, i7, i10);
        imageReceiver.h(canvas, null);
    }
}
