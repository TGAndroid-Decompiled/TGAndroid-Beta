package rg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.es;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fu0;
public final class x0 implements qg.b1 {
    public final y0 f44353a;

    public x0(y0 y0Var) {
        this.f44353a = y0Var;
    }

    @Override
    public final void a() {
        y0 y0Var = this.f44353a;
        y0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new ki.a(y0Var, 9)).setInterpolator(es.h);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void e() {
        y0 y0Var = this.f44353a;
        y0Var.f44367b.f43327a.e();
        y0Var.f44373w.setViewHidden(false);
        PhotoViewer photoViewer = ((fu0) y0Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.X2(true, true);
    }

    @Override
    public final void f() {
        this.f44353a.f44373w.setViewHidden(true);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
