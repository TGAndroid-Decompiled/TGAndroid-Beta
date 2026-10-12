package qg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.js;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bu0;
public final class v0 implements pg.c1 {
    public final w0 f46531a;

    public v0(w0 w0Var) {
        this.f46531a = w0Var;
    }

    @Override
    public final void a() {
        w0 w0Var = this.f46531a;
        w0Var.f46535e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new org.telegram.ui.Components.voip.s0(w0Var, 8)).setInterpolator(js.h);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void e() {
        w0 w0Var = this.f46531a;
        w0Var.f46533b.f45700a.e();
        w0Var.f46540w.setViewHidden(false);
        PhotoViewer photoViewer = ((bu0) w0Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.X2(true, true);
    }

    @Override
    public final void f() {
        this.f46531a.f46540w.setViewHidden(true);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
