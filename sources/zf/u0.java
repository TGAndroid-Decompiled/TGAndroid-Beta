package zf;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.er;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.xs0;

public final class u0 implements yf.a1 {

    public final v0 f50719a;

    public u0(v0 v0Var) {
        this.f50719a = v0Var;
    }

    @Override
    public final void a() {
        v0 v0Var = this.f50719a;
        v0Var.f50726e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new lh.m2(v0Var, 22)).setInterpolator(er.h);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void e() {
        v0 v0Var = this.f50719a;
        v0Var.f50724b.f50076a.g();
        v0Var.f50731w.setViewHidden(false);
        PhotoViewer photoViewer = ((xs0) v0Var).G;
        Drawable[] drawableArr = PhotoViewer.P8;
        photoViewer.X2(true, true);
    }

    @Override
    public final void f() {
        this.f50719a.f50731w.setViewHidden(true);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
