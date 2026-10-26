package sg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.nt0;
public final class a0 extends q2 {
    public final n0 f48139y0;

    public a0(n0 n0Var, Context context, PointF pointF, float f7, float f10, qw0 qw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, qw0Var, document, obj);
        this.f48139y0 = n0Var;
    }

    @Override
    public final void q(xj0 xj0Var) {
        PhotoViewer photoViewer = ((nt0) this.f48139y0).f41999d2;
        s81 s81Var = photoViewer.F2;
        if (s81Var == null) {
            return;
        }
        long n10 = s81Var.n();
        long j10 = photoViewer.f35722m8;
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 / 1000;
        }
        xj0Var.U(n10 - j11);
    }
}
