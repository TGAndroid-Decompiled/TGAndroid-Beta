package tg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.tp0;
public final class y extends g2 {
    public final g0 f57604z0;

    public y(g0 g0Var, Context context, PointF pointF, float f10, float f11, nt0 nt0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f10, f11, nt0Var, document, obj);
        this.f57604z0 = g0Var;
    }

    @Override
    public final void q(ch0 ch0Var) {
        PhotoViewer photoViewer = ((tp0) this.f57604z0).Y1;
        u51 u51Var = photoViewer.G2;
        if (u51Var == null) {
            return;
        }
        long S = u51Var.S();
        long j3 = photoViewer.f42829m8;
        long j10 = 0;
        if (j3 > 0) {
            j10 = j3 / 1000;
        }
        ch0Var.U(S - j10);
    }
}
