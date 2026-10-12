package rg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.hu0;
public final class z extends q2 {
    public final o0 f44632y0;

    public z(o0 o0Var, Context context, PointF pointF, float f7, float f10, iw0 iw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, iw0Var, document, obj);
        this.f44632y0 = o0Var;
    }

    @Override
    public final void q(yj0 yj0Var) {
        PhotoViewer photoViewer = ((hu0) this.f44632y0).f36960o2;
        h81 h81Var = photoViewer.F2;
        if (h81Var == null) {
            return;
        }
        long n10 = h81Var.n();
        long j10 = photoViewer.f32302m8;
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 / 1000;
        }
        yj0Var.U(n10 - j11);
    }
}
