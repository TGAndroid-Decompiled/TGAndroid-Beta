package th;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.u5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
public final class h extends sh.c {
    public final TLRPC.Document f58237b;
    public final Object f58238c;

    public h(Object obj, TLRPC.Document document) {
        boolean z10;
        this.f58237b = document;
        this.f58238c = obj;
        gj.H2(document);
        ImageReceiver imageReceiver = this.f57441a;
        if (!gj.u4(document) && !gj.N4(document)) {
            z10 = false;
        } else {
            z10 = true;
        }
        gj.K2(document, true);
        imageReceiver.p0(gc.b(document), "38_38", u5.f(document, m6.f29336cd, 1.0f, null), document.size, z10 ? "webp" : null, obj, 0);
    }

    @Override
    public final void c(Canvas canvas, int i7, int i10) {
        ImageReceiver imageReceiver = this.f57441a;
        imageReceiver.y0(0.0f, 0.0f, i7, i10);
        imageReceiver.h(canvas, null);
    }
}
