package qg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.tr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ut0;
public final class v0 implements pg.e1 {
    public final w0 f45379a;

    public v0(w0 w0Var) {
        this.f45379a = w0Var;
    }

    @Override
    public final void a() {
        w0 w0Var = this.f45379a;
        w0Var.f45393e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new org.telegram.ui.Components.voip.r0(w0Var, 8)).setInterpolator(tr.h);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void e() {
        w0 w0Var = this.f45379a;
        w0Var.f45391b.f44685a.j();
        w0Var.f45398w.setViewHidden(false);
        PhotoViewer photoViewer = ((ut0) w0Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.X2(true, true);
    }

    @Override
    public final void f() {
        this.f45379a.f45398w.setViewHidden(true);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
