package tg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.up0;
public final class x extends d2 {
    public final g0 f55895y0;

    public x(g0 g0Var, Context context, PointF pointF, float f10, float f11, mt0 mt0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f10, f11, mt0Var, document, obj);
        this.f55895y0 = g0Var;
    }

    @Override
    public final void q(zg0 zg0Var) {
        PhotoViewer photoViewer = ((up0) this.f55895y0).X1;
        s51 s51Var = photoViewer.F2;
        if (s51Var == null) {
            return;
        }
        long S = s51Var.S();
        long j3 = photoViewer.f41449l8;
        long j10 = 0;
        if (j3 > 0) {
            j10 = j3 / 1000;
        }
        zg0Var.U(S - j10);
    }
}
