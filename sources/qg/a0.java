package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cu0;
public final class a0 extends q2 {
    public final p0 f41310y0;

    public a0(p0 p0Var, Context context, PointF pointF, float f7, float f10, kv0 kv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, kv0Var, document, obj);
        this.f41310y0 = p0Var;
    }

    @Override
    public final void q(yi0 yi0Var) {
        PhotoViewer photoViewer = ((cu0) this.f41310y0).f32924o2;
        h71 h71Var = photoViewer.F2;
        if (h71Var == null) {
            return;
        }
        long n10 = h71Var.n();
        long j3 = photoViewer.f31029m8;
        long j10 = 0;
        if (j3 > 0) {
            j10 = j3 / 1000;
        }
        yi0Var.U(n10 - j10);
    }
}
