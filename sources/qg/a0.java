package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.st0;
public final class a0 extends o2 {
    public final n0 f41573y0;

    public a0(n0 n0Var, Context context, PointF pointF, float f7, float f10, uv0 uv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, uv0Var, document, obj);
        this.f41573y0 = n0Var;
    }

    @Override
    public final void q(ij0 ij0Var) {
        PhotoViewer photoViewer = ((st0) this.f41573y0).f37864o2;
        s71 s71Var = photoViewer.F2;
        if (s71Var == null) {
            return;
        }
        long n10 = s71Var.n();
        long j3 = photoViewer.f31299m8;
        long j10 = 0;
        if (j3 > 0) {
            j10 = j3 / 1000;
        }
        ij0Var.U(n10 - j10);
    }
}
