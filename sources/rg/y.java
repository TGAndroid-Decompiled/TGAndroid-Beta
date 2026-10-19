package rg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.gt0;
public final class y extends o2 {
    public final m0 f45701y0;

    public y(m0 m0Var, Context context, PointF pointF, float f7, float f10, ew0 ew0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, ew0Var, document, obj);
        this.f45701y0 = m0Var;
    }

    @Override
    public final void q(uj0 uj0Var) {
        PhotoViewer photoViewer = ((gt0) this.f45701y0).f37407o2;
        b81 b81Var = photoViewer.F2;
        if (b81Var == null) {
            return;
        }
        long n10 = b81Var.n();
        long j10 = photoViewer.f33348m8;
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 / 1000;
        }
        uj0Var.U(n10 - j11);
    }
}
