package qg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.qr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zt0;
public final class w0 implements pg.d1 {
    public final x0 f41990a;

    public w0(x0 x0Var) {
        this.f41990a = x0Var;
    }

    @Override
    public final void a() {
        x0 x0Var = this.f41990a;
        x0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new org.telegram.ui.Components.voip.r0(x0Var, 8)).setInterpolator(qr.h);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void e() {
        x0 x0Var = this.f41990a;
        x0Var.f41997b.f41321a.e();
        x0Var.f42003w.setViewHidden(false);
        PhotoViewer photoViewer = ((zt0) x0Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.W2(true, true);
    }

    @Override
    public final void f() {
        this.f41990a.f42003w.setViewHidden(true);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
