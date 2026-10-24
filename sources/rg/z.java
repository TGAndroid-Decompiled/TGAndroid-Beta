package rg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.it0;
public final class z extends p2 {
    public final m0 f46147y0;

    public z(m0 m0Var, Context context, PointF pointF, float f7, float f10, hw0 hw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, hw0Var, document, obj);
        this.f46147y0 = m0Var;
    }

    @Override
    public final void q(xj0 xj0Var) {
        PhotoViewer photoViewer = ((it0) this.f46147y0).f38385o2;
        j81 j81Var = photoViewer.F2;
        if (j81Var == null) {
            return;
        }
        long n10 = j81Var.n();
        long j10 = photoViewer.f33658m8;
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 / 1000;
        }
        xj0Var.U(n10 - j11);
    }
}
