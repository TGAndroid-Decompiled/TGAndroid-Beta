package qg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.qr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zt0;
public final class v0 implements pg.d1 {
    public final w0 f41942a;

    public v0(w0 w0Var) {
        this.f41942a = w0Var;
    }

    @Override
    public final void a() {
        w0 w0Var = this.f41942a;
        w0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new org.telegram.ui.Components.voip.r0(w0Var, 8)).setInterpolator(qr.h);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void e() {
        w0 w0Var = this.f41942a;
        w0Var.f41949b.f41280a.e();
        w0Var.f41955w.setViewHidden(false);
        PhotoViewer photoViewer = ((zt0) w0Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.W2(true, true);
    }

    @Override
    public final void f() {
        this.f41942a.f41955w.setViewHidden(true);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
