package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.vt0;
public final class z extends o2 {
    public final m0 f45432y0;

    public z(m0 m0Var, Context context, PointF pointF, float f7, float f10, fw0 fw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, fw0Var, document, obj);
        this.f45432y0 = m0Var;
    }

    @Override
    public final void q(kj0 kj0Var) {
        PhotoViewer photoViewer = ((vt0) this.f45432y0).f41814o2;
        d81 d81Var = photoViewer.F2;
        if (d81Var == null) {
            return;
        }
        long n10 = d81Var.n();
        long j3 = photoViewer.f33969m8;
        long j10 = 0;
        if (j3 > 0) {
            j10 = j3 / 1000;
        }
        kj0Var.U(n10 - j10);
    }
}
