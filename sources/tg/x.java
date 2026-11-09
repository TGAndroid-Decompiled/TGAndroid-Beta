package tg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.ot0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.wp0;
public final class x extends d2 {
    public final g0 f55999y0;

    public x(g0 g0Var, Context context, PointF pointF, float f10, float f11, ot0 ot0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f10, f11, ot0Var, document, obj);
        this.f55999y0 = g0Var;
    }

    @Override
    public final void q(ah0 ah0Var) {
        PhotoViewer photoViewer = ((wp0) this.f55999y0).X1;
        u51 u51Var = photoViewer.F2;
        if (u51Var == null) {
            return;
        }
        long S = u51Var.S();
        long j3 = photoViewer.f41459l8;
        long j10 = 0;
        if (j3 > 0) {
            j10 = j3 / 1000;
        }
        ah0Var.U(S - j10);
    }
}
