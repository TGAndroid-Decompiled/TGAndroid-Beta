package tg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.vt0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.vp0;
public final class y extends f2 {
    public final g0 f58171z0;

    public y(g0 g0Var, Context context, PointF pointF, float f10, float f11, vt0 vt0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f10, f11, vt0Var, document, obj);
        this.f58171z0 = g0Var;
    }

    @Override
    public final void q(mh0 mh0Var) {
        PhotoViewer photoViewer = ((vp0) this.f58171z0).Y1;
        f61 f61Var = photoViewer.G2;
        if (f61Var == null) {
            return;
        }
        long S = f61Var.S();
        long j3 = photoViewer.f43274m8;
        long j10 = 0;
        if (j3 > 0) {
            j10 = j3 / 1000;
        }
        mh0Var.U(S - j10);
    }
}
