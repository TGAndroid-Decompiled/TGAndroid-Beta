package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;
public final class z extends o2 {
    public final m0 f46760y0;

    public z(m0 m0Var, Context context, PointF pointF, float f7, float f10, nw0 nw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, nw0Var, document, obj);
        this.f46760y0 = m0Var;
    }

    @Override
    public final void q(dk0 dk0Var) {
        PhotoViewer photoViewer = ((au0) this.f46760y0).f36210o2;
        l81 l81Var = photoViewer.F2;
        if (l81Var == null) {
            return;
        }
        long n10 = l81Var.n();
        long j3 = photoViewer.f34041m8;
        long j10 = 0;
        if (j3 > 0) {
            j10 = j3 / 1000;
        }
        dk0Var.U(n10 - j10);
    }
}
