package qg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.is;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;
public final class v0 implements pg.d1 {
    public final w0 f46630a;

    public v0(w0 w0Var) {
        this.f46630a = w0Var;
    }

    @Override
    public final void a() {
        w0 w0Var = this.f46630a;
        w0Var.f46634e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new org.telegram.ui.Components.voip.r0(w0Var, 8)).setInterpolator(is.h);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void e() {
        w0 w0Var = this.f46630a;
        w0Var.f46632b.f45865a.e();
        w0Var.f46639w.setViewHidden(false);
        PhotoViewer photoViewer = ((au0) w0Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.X2(true, true);
    }

    @Override
    public final void f() {
        this.f46630a.f46639w.setViewHidden(true);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
