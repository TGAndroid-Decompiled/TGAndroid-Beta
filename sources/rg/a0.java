package rg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zt0;
public final class a0 extends q2 {
    public final o0 f45139y0;

    public a0(o0 o0Var, Context context, PointF pointF, float f7, float f10, iv0 iv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, iv0Var, document, obj);
        this.f45139y0 = o0Var;
    }

    @Override
    public final void q(xi0 xi0Var) {
        PhotoViewer photoViewer = ((zt0) this.f45139y0).f43542o2;
        g71 g71Var = photoViewer.F2;
        if (g71Var == null) {
            return;
        }
        long n10 = g71Var.n();
        long j3 = photoViewer.f33643l8;
        long j10 = 0;
        if (j3 > 0) {
            j10 = j3 / 1000;
        }
        xi0Var.R(n10 - j10);
    }
}
