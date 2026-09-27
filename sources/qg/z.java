package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.u71;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.vt0;
public final class z extends o2 {
    public final m0 f42056y0;

    public z(m0 m0Var, Context context, PointF pointF, float f7, float f10, wv0 wv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, wv0Var, document, obj);
        this.f42056y0 = m0Var;
    }

    @Override
    public final void q(kj0 kj0Var) {
        PhotoViewer photoViewer = ((vt0) this.f42056y0).f38703o2;
        u71 u71Var = photoViewer.F2;
        if (u71Var == null) {
            return;
        }
        long n10 = u71Var.n();
        long j3 = photoViewer.f31300m8;
        long j10 = 0;
        if (j3 > 0) {
            j10 = j3 / 1000;
        }
        kj0Var.U(n10 - j10);
    }
}
