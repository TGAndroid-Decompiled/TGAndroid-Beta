package qg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.is;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zt0;
public final class v0 implements pg.d1 {
    public final w0 f46662a;

    public v0(w0 w0Var) {
        this.f46662a = w0Var;
    }

    @Override
    public final void a() {
        w0 w0Var = this.f46662a;
        w0Var.f46676e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new org.telegram.ui.Components.voip.s0(w0Var, 8)).setInterpolator(is.h);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void e() {
        w0 w0Var = this.f46662a;
        w0Var.f46674b.f45855a.e();
        w0Var.f46681w.setViewHidden(false);
        PhotoViewer photoViewer = ((zt0) w0Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.X2(true, true);
    }

    @Override
    public final void f() {
        this.f46662a.f46681w.setViewHidden(true);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
