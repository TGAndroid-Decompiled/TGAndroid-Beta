package rg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.gt0;
public final class y extends o2 {
    public final m0 f45709y0;

    public y(m0 m0Var, Context context, PointF pointF, float f7, float f10, fw0 fw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, fw0Var, document, obj);
        this.f45709y0 = m0Var;
    }

    @Override
    public final void q(vj0 vj0Var) {
        PhotoViewer photoViewer = ((gt0) this.f45709y0).f37414o2;
        c81 c81Var = photoViewer.F2;
        if (c81Var == null) {
            return;
        }
        long n10 = c81Var.n();
        long j10 = photoViewer.f33355m8;
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 / 1000;
        }
        vj0Var.U(n10 - j11);
    }
}
