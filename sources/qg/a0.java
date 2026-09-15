package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;
public final class a0 extends q2 {
    public final p0 f41283y0;

    public a0(p0 p0Var, Context context, PointF pointF, float f7, float f10, jv0 jv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, jv0Var, document, obj);
        this.f41283y0 = p0Var;
    }

    @Override
    public final void q(xi0 xi0Var) {
        PhotoViewer photoViewer = ((au0) this.f41283y0).f31957o2;
        g71 g71Var = photoViewer.F2;
        if (g71Var == null) {
            return;
        }
        long n10 = g71Var.n();
        long j3 = photoViewer.f31003l8;
        long j10 = 0;
        if (j3 > 0) {
            j10 = j3 / 1000;
        }
        xi0Var.T(n10 - j10);
    }
}
