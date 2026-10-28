package sg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.pt0;
public final class z extends p2 {
    public final m0 f48635y0;

    public z(m0 m0Var, Context context, PointF pointF, float f7, float f10, rw0 rw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, rw0Var, document, obj);
        this.f48635y0 = m0Var;
    }

    @Override
    public final void q(yj0 yj0Var) {
        PhotoViewer photoViewer = ((pt0) this.f48635y0).f42502d2;
        t81 t81Var = photoViewer.F2;
        if (t81Var == null) {
            return;
        }
        long n10 = t81Var.n();
        long j10 = photoViewer.f35746m8;
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 / 1000;
        }
        yj0Var.U(n10 - j11);
    }
}
