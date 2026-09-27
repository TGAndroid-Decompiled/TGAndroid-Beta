package qg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.sr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ut0;
public final class v0 implements pg.e1 {
    public final w0 f41993a;

    public v0(w0 w0Var) {
        this.f41993a = w0Var;
    }

    @Override
    public final void a() {
        w0 w0Var = this.f41993a;
        w0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new org.telegram.ui.Components.voip.r0(w0Var, 8)).setInterpolator(sr.h);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void e() {
        w0 w0Var = this.f41993a;
        w0Var.f42005b.f41299a.g();
        w0Var.f42011w.setViewHidden(false);
        PhotoViewer photoViewer = ((ut0) w0Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.W2(true, true);
    }

    @Override
    public final void f() {
        this.f41993a.f42011w.setViewHidden(true);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
