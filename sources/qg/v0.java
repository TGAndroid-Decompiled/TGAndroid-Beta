package qg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.hs;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;
public final class v0 implements pg.d1 {
    public final w0 f46586a;

    public v0(w0 w0Var) {
        this.f46586a = w0Var;
    }

    @Override
    public final void a() {
        w0 w0Var = this.f46586a;
        w0Var.f46590e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new org.telegram.ui.Components.voip.r0(w0Var, 8)).setInterpolator(hs.h);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void e() {
        w0 w0Var = this.f46586a;
        w0Var.f46588b.f45821a.e();
        w0Var.f46595w.setViewHidden(false);
        PhotoViewer photoViewer = ((au0) w0Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.X2(true, true);
    }

    @Override
    public final void f() {
        this.f46586a.f46595w.setViewHidden(true);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
