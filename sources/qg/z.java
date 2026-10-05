package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.vt0;
public final class z extends o2 {
    public final m0 f45447y0;

    public z(m0 m0Var, Context context, PointF pointF, float f7, float f10, gw0 gw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, gw0Var, document, obj);
        this.f45447y0 = m0Var;
    }

    @Override
    public final void q(kj0 kj0Var) {
        PhotoViewer photoViewer = ((vt0) this.f45447y0).f41820o2;
        e81 e81Var = photoViewer.F2;
        if (e81Var == null) {
            return;
        }
        long n10 = e81Var.n();
        long j3 = photoViewer.f33989m8;
        long j10 = 0;
        if (j3 > 0) {
            j10 = j3 / 1000;
        }
        kj0Var.U(n10 - j10);
    }
}
