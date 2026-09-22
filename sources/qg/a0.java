package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;
public final class a0 extends o2 {
    public final n0 f41607y0;

    public a0(n0 n0Var, Context context, PointF pointF, float f7, float f10, wv0 wv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, wv0Var, document, obj);
        this.f41607y0 = n0Var;
    }

    @Override
    public final void q(kj0 kj0Var) {
        PhotoViewer photoViewer = ((au0) this.f41607y0).f32177o2;
        v71 v71Var = photoViewer.F2;
        if (v71Var == null) {
            return;
        }
        long n10 = v71Var.n();
        long j3 = photoViewer.f31317m8;
        long j10 = 0;
        if (j3 > 0) {
            j10 = j3 / 1000;
        }
        kj0Var.U(n10 - j10);
    }
}
