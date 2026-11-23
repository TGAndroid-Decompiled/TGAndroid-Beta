package tg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.yt0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.wp0;
public final class z extends g2 {
    public final h0 f58197z0;

    public z(h0 h0Var, Context context, PointF pointF, float f10, float f11, yt0 yt0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f10, f11, yt0Var, document, obj);
        this.f58197z0 = h0Var;
    }

    @Override
    public final void q(oh0 oh0Var) {
        PhotoViewer photoViewer = ((wp0) this.f58197z0).Y1;
        i61 i61Var = photoViewer.G2;
        if (i61Var == null) {
            return;
        }
        long S = i61Var.S();
        long j3 = photoViewer.f43284m8;
        long j10 = 0;
        if (j3 > 0) {
            j10 = j3 / 1000;
        }
        oh0Var.U(S - j10);
    }
}
