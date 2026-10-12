package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cu0;
public final class z extends p2 {
    public final m0 f46580y0;

    public z(m0 m0Var, Context context, PointF pointF, float f7, float f10, sw0 sw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, sw0Var, document, obj);
        this.f46580y0 = m0Var;
    }

    @Override
    public final void q(fk0 fk0Var) {
        PhotoViewer photoViewer = ((cu0) this.f46580y0).f36517o2;
        q81 q81Var = photoViewer.F2;
        if (q81Var == null) {
            return;
        }
        long n10 = q81Var.n();
        long j3 = photoViewer.f33816m8;
        long j10 = 0;
        if (j3 > 0) {
            j10 = j3 / 1000;
        }
        fk0Var.U(n10 - j10);
    }
}
