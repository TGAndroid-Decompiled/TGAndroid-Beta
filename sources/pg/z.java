package pg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zt0;
public final class z extends o2 {
    public final m0 f40384y0;

    public z(m0 m0Var, Context context, PointF pointF, float f7, float f10, tv0 tv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, tv0Var, document, obj);
        this.f40384y0 = m0Var;
    }

    @Override
    public final void q(hj0 hj0Var) {
        PhotoViewer photoViewer = ((zt0) this.f40384y0).f39441o2;
        t71 t71Var = photoViewer.F2;
        if (t71Var == null) {
            return;
        }
        long n10 = t71Var.n();
        long j3 = photoViewer.f30116l8;
        long j10 = 0;
        if (j3 > 0) {
            j10 = j3 / 1000;
        }
        hj0Var.T(n10 - j10);
    }
}
