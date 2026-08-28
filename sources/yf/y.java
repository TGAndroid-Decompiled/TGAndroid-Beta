package yf;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.xs0;
public final class y extends n2 {
    public final l0 f50181u0;

    public y(l0 l0Var, Context context, PointF pointF, float f10, float f11, qu0 qu0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f10, f11, qu0Var, document, obj);
        this.f50181u0 = l0Var;
    }

    @Override
    public final void q(mi0 mi0Var) {
        PhotoViewer photoViewer = ((xs0) this.f50181u0).f44585k2;
        k61 k61Var = photoViewer.B2;
        if (k61Var == null) {
            return;
        }
        long o6 = k61Var.o();
        long j10 = photoViewer.f35653h8;
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 / 1000;
        }
        mi0Var.R(o6 - j11);
    }
}
