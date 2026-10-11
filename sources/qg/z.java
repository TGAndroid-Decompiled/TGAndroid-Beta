package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.m81;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;
public final class z extends o2 {
    public final m0 f46726y0;

    public z(m0 m0Var, Context context, PointF pointF, float f7, float f10, ow0 ow0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, ow0Var, document, obj);
        this.f46726y0 = m0Var;
    }

    @Override
    public final void q(ek0 ek0Var) {
        PhotoViewer photoViewer = ((au0) this.f46726y0).f36176o2;
        m81 m81Var = photoViewer.F2;
        if (m81Var == null) {
            return;
        }
        long n10 = m81Var.n();
        long j3 = photoViewer.f34007m8;
        long j10 = 0;
        if (j3 > 0) {
            j10 = j3 / 1000;
        }
        ek0Var.U(n10 - j10);
    }
}
