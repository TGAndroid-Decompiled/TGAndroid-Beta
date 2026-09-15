package qg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.qr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zt0;
public final class y0 implements pg.b1 {
    public final z0 f41716a;

    public y0(z0 z0Var) {
        this.f41716a = z0Var;
    }

    @Override
    public final void a() {
        z0 z0Var = this.f41716a;
        z0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new org.telegram.ui.Components.voip.r0(z0Var, 8)).setInterpolator(qr.h);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void e() {
        z0 z0Var = this.f41716a;
        z0Var.f41725b.f41012a.e();
        z0Var.f41731w.setViewHidden(false);
        PhotoViewer photoViewer = ((zt0) z0Var).K;
        Drawable[] drawableArr = PhotoViewer.T8;
        photoViewer.X2(true, true);
    }

    @Override
    public final void f() {
        this.f41716a.f41731w.setViewHidden(true);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
