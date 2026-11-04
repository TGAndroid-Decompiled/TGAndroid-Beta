package uh;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.t5;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
public final class h extends th.c {
    public final TLRPC.Document f56367b;
    public final Object f56368c;

    public h(Object obj, TLRPC.Document document) {
        boolean z10;
        this.f56367b = document;
        this.f56368c = obj;
        zi.I2(document);
        ImageReceiver imageReceiver = this.f55398a;
        if (!zi.v4(document) && !zi.O4(document)) {
            z10 = false;
        } else {
            z10 = true;
        }
        zi.L2(document, true);
        imageReceiver.p0(ac.b(document), "38_38", t5.f(document, k6.Zc, 1.0f, null), document.size, z10 ? "webp" : null, obj, 0);
    }

    @Override
    public final void c(Canvas canvas, int i3, int i10) {
        ImageReceiver imageReceiver = this.f55398a;
        imageReceiver.y0(0.0f, 0.0f, i3, i10);
        imageReceiver.h(canvas, null);
    }
}
