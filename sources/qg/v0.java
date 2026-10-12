package qg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.js;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bu0;
public final class v0 implements pg.c1 {
    public final w0 f46523a;

    public v0(w0 w0Var) {
        this.f46523a = w0Var;
    }

    @Override
    public final void a() {
        w0 w0Var = this.f46523a;
        w0Var.f46527e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new org.telegram.ui.Components.voip.s0(w0Var, 8)).setInterpolator(js.h);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void e() {
        w0 w0Var = this.f46523a;
        w0Var.f46525b.f45695a.e();
        w0Var.f46532w.setViewHidden(false);
        PhotoViewer photoViewer = ((bu0) w0Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.X2(true, true);
    }

    @Override
    public final void f() {
        this.f46523a.f46532w.setViewHidden(true);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
