package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.st0;
public final class a0 extends o2 {
    public final n0 f41571y0;

    public a0(n0 n0Var, Context context, PointF pointF, float f7, float f10, vv0 vv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, vv0Var, document, obj);
        this.f41571y0 = n0Var;
    }

    @Override
    public final void q(jj0 jj0Var) {
        PhotoViewer photoViewer = ((st0) this.f41571y0).f37862o2;
        t71 t71Var = photoViewer.F2;
        if (t71Var == null) {
            return;
        }
        long n10 = t71Var.n();
        long j3 = photoViewer.f31297m8;
        long j10 = 0;
        if (j3 > 0) {
            j10 = j3 / 1000;
        }
        jj0Var.U(n10 - j10);
    }
}
