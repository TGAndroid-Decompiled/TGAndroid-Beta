package sg;

import android.graphics.drawable.Drawable;
import fi.e4;
import org.telegram.ui.Components.ds;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.mt0;
public final class w0 implements rg.b1 {
    public final x0 f48546a;

    public w0(x0 x0Var) {
        this.f48546a = x0Var;
    }

    @Override
    public final void a() {
        x0 x0Var = this.f48546a;
        x0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new e4(x0Var, 19)).setInterpolator(ds.h);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void e() {
        x0 x0Var = this.f48546a;
        x0Var.f48551b.f47559a.a();
        x0Var.f48557w.setViewHidden(false);
        PhotoViewer photoViewer = ((mt0) x0Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.Z2(true, true);
    }

    @Override
    public final void f() {
        this.f48546a.f48557w.setViewHidden(true);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
