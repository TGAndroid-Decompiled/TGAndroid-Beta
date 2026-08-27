package zf;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ys0;

public final class y extends o2 {

    public final l0 f50776u0;

    public y(l0 l0Var, Context context, PointF pointF, float f10, float f11, tu0 tu0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f10, f11, tu0Var, document, obj);
        this.f50776u0 = l0Var;
    }

    @Override
    public final void q(oi0 oi0Var) {
        PhotoViewer photoViewer = ((ys0) this.f50776u0).f44893k2;
        m61 m61Var = photoViewer.B2;
        if (m61Var == null) {
            return;
        }
        long jO = m61Var.o();
        long j10 = photoViewer.f35656h8;
        oi0Var.R(jO - (j10 > 0 ? j10 / 1000 : 0L));
    }
}
