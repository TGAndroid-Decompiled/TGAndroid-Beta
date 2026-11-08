package th;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.ij;
import org.telegram.messenger.t5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
public final class h extends sh.c {
    public final TLRPC.Document f56062b;
    public final Object f56063c;

    public h(Object obj, TLRPC.Document document) {
        boolean z9;
        this.f56062b = document;
        this.f56063c = obj;
        ij.I2(document);
        ImageReceiver imageReceiver = this.f55293a;
        if (!ij.v4(document) && !ij.O4(document)) {
            z9 = false;
        } else {
            z9 = true;
        }
        ij.L2(document, true);
        imageReceiver.p0(hc.b(document), "38_38", t5.f(document, k6.Zc, 1.0f, null), document.size, z9 ? "webp" : null, obj, 0);
    }

    @Override
    public final void c(Canvas canvas, int i7, int i10) {
        ImageReceiver imageReceiver = this.f55293a;
        imageReceiver.y0(0.0f, 0.0f, i7, i10);
        imageReceiver.h(canvas, null);
    }
}
