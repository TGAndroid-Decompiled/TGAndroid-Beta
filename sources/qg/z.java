package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.u71;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;
public final class z extends n2 {
    public final m0 f41995y0;

    public z(m0 m0Var, Context context, PointF pointF, float f7, float f10, vv0 vv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, vv0Var, document, obj);
        this.f41995y0 = m0Var;
    }

    @Override
    public final void q(ij0 ij0Var) {
        PhotoViewer photoViewer = ((au0) this.f41995y0).f32142o2;
        u71 u71Var = photoViewer.F2;
        if (u71Var == null) {
            return;
        }
        long n10 = u71Var.n();
        long j3 = photoViewer.f31256m8;
        long j10 = 0;
        if (j3 > 0) {
            j10 = j3 / 1000;
        }
        ij0Var.U(n10 - j10);
    }
}
