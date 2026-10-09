package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bu0;
public final class z extends p2 {
    public final m0 f46643y0;

    public z(m0 m0Var, Context context, PointF pointF, float f7, float f10, mw0 mw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, mw0Var, document, obj);
        this.f46643y0 = m0Var;
    }

    @Override
    public final void q(ck0 ck0Var) {
        PhotoViewer photoViewer = ((bu0) this.f46643y0).f36434o2;
        k81 k81Var = photoViewer.F2;
        if (k81Var == null) {
            return;
        }
        long n10 = k81Var.n();
        long j3 = photoViewer.f33979m8;
        long j10 = 0;
        if (j3 > 0) {
            j10 = j3 / 1000;
        }
        ck0Var.U(n10 - j10);
    }
}
