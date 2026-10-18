package rg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.it0;
public final class y extends o2 {
    public final m0 f45755y0;

    public y(m0 m0Var, Context context, PointF pointF, float f7, float f10, dw0 dw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, dw0Var, document, obj);
        this.f45755y0 = m0Var;
    }

    @Override
    public final void q(uj0 uj0Var) {
        PhotoViewer photoViewer = ((it0) this.f45755y0).f37992o2;
        a81 a81Var = photoViewer.F2;
        if (a81Var == null) {
            return;
        }
        long n10 = a81Var.n();
        long j10 = photoViewer.f33349m8;
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 / 1000;
        }
        uj0Var.U(n10 - j11);
    }
}
