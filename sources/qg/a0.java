package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.tt0;
public final class a0 extends q2 {
    public final p0 f41235y0;

    public a0(p0 p0Var, Context context, PointF pointF, float f7, float f10, jv0 jv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, jv0Var, document, obj);
        this.f41235y0 = p0Var;
    }

    @Override
    public final void q(yi0 yi0Var) {
        PhotoViewer photoViewer = ((tt0) this.f41235y0).f37756o2;
        f71 f71Var = photoViewer.F2;
        if (f71Var == null) {
            return;
        }
        long n10 = f71Var.n();
        long j3 = photoViewer.f30983m8;
        long j10 = 0;
        if (j3 > 0) {
            j10 = j3 / 1000;
        }
        yi0Var.U(n10 - j10);
    }
}
