package th;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.u5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
public final class h extends sh.c {
    public final TLRPC.Document f58268b;
    public final Object f58269c;

    public h(Object obj, TLRPC.Document document) {
        boolean z10;
        this.f58268b = document;
        this.f58269c = obj;
        fj.H2(document);
        ImageReceiver imageReceiver = this.f57472a;
        if (!fj.u4(document) && !fj.N4(document)) {
            z10 = false;
        } else {
            z10 = true;
        }
        fj.K2(document, true);
        imageReceiver.p0(fc.b(document), "38_38", u5.f(document, m6.f29367cd, 1.0f, null), document.size, z10 ? "webp" : null, obj, 0);
    }

    @Override
    public final void c(Canvas canvas, int i7, int i10) {
        ImageReceiver imageReceiver = this.f57472a;
        imageReceiver.y0(0.0f, 0.0f, i7, i10);
        imageReceiver.h(canvas, null);
    }
}
