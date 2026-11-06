package tg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.up0;
public final class x extends d2 {
    public final g0 f55894y0;

    public x(g0 g0Var, Context context, PointF pointF, float f10, float f11, mt0 mt0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f10, f11, mt0Var, document, obj);
        this.f55894y0 = g0Var;
    }

    @Override
    public final void q(zg0 zg0Var) {
        PhotoViewer photoViewer = ((up0) this.f55894y0).X1;
        t51 t51Var = photoViewer.F2;
        if (t51Var == null) {
            return;
        }
        long S = t51Var.S();
        long j3 = photoViewer.f41448l8;
        long j10 = 0;
        if (j3 > 0) {
            j10 = j3 / 1000;
        }
        zg0Var.U(S - j10);
    }
}
