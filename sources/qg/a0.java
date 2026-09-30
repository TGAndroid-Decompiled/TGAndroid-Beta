package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.st0;
public final class a0 extends o2 {
    public final n0 f41671y0;

    public a0(n0 n0Var, Context context, PointF pointF, float f7, float f10, xv0 xv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, xv0Var, document, obj);
        this.f41671y0 = n0Var;
    }

    @Override
    public final void q(lj0 lj0Var) {
        PhotoViewer photoViewer = ((st0) this.f41671y0).f37971o2;
        v71 v71Var = photoViewer.F2;
        if (v71Var == null) {
            return;
        }
        long n10 = v71Var.n();
        long j3 = photoViewer.f31372m8;
        long j10 = 0;
        if (j3 > 0) {
            j10 = j3 / 1000;
        }
        lj0Var.U(n10 - j10);
    }
}
