package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;
public final class a0 extends o2 {
    public final n0 f41586y0;

    public a0(n0 n0Var, Context context, PointF pointF, float f7, float f10, uv0 uv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, uv0Var, document, obj);
        this.f41586y0 = n0Var;
    }

    @Override
    public final void q(hj0 hj0Var) {
        PhotoViewer photoViewer = ((au0) this.f41586y0).f32159o2;
        t71 t71Var = photoViewer.F2;
        if (t71Var == null) {
            return;
        }
        long n10 = t71Var.n();
        long j3 = photoViewer.f31296m8;
        long j10 = 0;
        if (j3 > 0) {
            j10 = j3 / 1000;
        }
        hj0Var.U(n10 - j10);
    }
}
