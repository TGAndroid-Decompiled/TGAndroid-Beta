package sg;

import android.graphics.drawable.Drawable;
import fi.e4;
import org.telegram.ui.Components.ds;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ot0;
public final class v0 implements rg.b1 {
    public final w0 f48574a;

    public v0(w0 w0Var) {
        this.f48574a = w0Var;
    }

    @Override
    public final void a() {
        w0 w0Var = this.f48574a;
        w0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new e4(w0Var, 19)).setInterpolator(ds.h);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void e() {
        w0 w0Var = this.f48574a;
        w0Var.f48579b.f47597a.a();
        w0Var.f48585w.setViewHidden(false);
        PhotoViewer photoViewer = ((ot0) w0Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.a3(true, true);
    }

    @Override
    public final void f() {
        this.f48574a.f48585w.setViewHidden(true);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
