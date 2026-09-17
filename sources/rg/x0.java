package rg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.pr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.yt0;
public final class x0 implements qg.b1 {
    public final y0 f45570a;

    public x0(y0 y0Var) {
        this.f45570a = y0Var;
    }

    @Override
    public final void a() {
        y0 y0Var = this.f45570a;
        y0Var.f45584e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new ki.a(y0Var, 10)).setInterpolator(pr.h);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void e() {
        y0 y0Var = this.f45570a;
        y0Var.f45582b.f44618a.f();
        y0Var.f45589w.setViewHidden(false);
        PhotoViewer photoViewer = ((yt0) y0Var).K;
        Drawable[] drawableArr = PhotoViewer.T8;
        photoViewer.X2(true, true);
    }

    @Override
    public final void f() {
        this.f45570a.f45589w.setViewHidden(true);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
