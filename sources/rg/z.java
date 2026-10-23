package rg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.jt0;
public final class z extends p2 {
    public final m0 f46148y0;

    public z(m0 m0Var, Context context, PointF pointF, float f7, float f10, iw0 iw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, iw0Var, document, obj);
        this.f46148y0 = m0Var;
    }

    @Override
    public final void q(yj0 yj0Var) {
        PhotoViewer photoViewer = ((jt0) this.f46148y0).f38700o2;
        j81 j81Var = photoViewer.F2;
        if (j81Var == null) {
            return;
        }
        long n10 = j81Var.n();
        long j10 = photoViewer.f33656m8;
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 / 1000;
        }
        yj0Var.U(n10 - j11);
    }
}
