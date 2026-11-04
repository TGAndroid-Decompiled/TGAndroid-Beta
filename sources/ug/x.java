package ug;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.m51;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.lp0;
public final class x extends d2 {
    public final f0 f56293z0;

    public x(f0 f0Var, Context context, PointF pointF, float f10, float f11, lt0 lt0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f10, f11, lt0Var, document, obj);
        this.f56293z0 = f0Var;
    }

    @Override
    public final void q(ch0 ch0Var) {
        PhotoViewer photoViewer = ((lp0) this.f56293z0).Y1;
        m51 m51Var = photoViewer.G2;
        if (m51Var == null) {
            return;
        }
        long S = m51Var.S();
        long j10 = photoViewer.f41494n8;
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 / 1000;
        }
        ch0Var.U(S - j11);
    }
}
