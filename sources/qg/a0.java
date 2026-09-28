package qg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.u71;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.st0;
public final class a0 extends o2 {
    public final n0 f41572y0;

    public a0(n0 n0Var, Context context, PointF pointF, float f7, float f10, wv0 wv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, wv0Var, document, obj);
        this.f41572y0 = n0Var;
    }

    @Override
    public final void q(kj0 kj0Var) {
        PhotoViewer photoViewer = ((st0) this.f41572y0).f37863o2;
        u71 u71Var = photoViewer.F2;
        if (u71Var == null) {
            return;
        }
        long n10 = u71Var.n();
        long j3 = photoViewer.f31298m8;
        long j10 = 0;
        if (j3 > 0) {
            j10 = j3 / 1000;
        }
        kj0Var.U(n10 - j10);
    }
}
