package yf;

import android.graphics.drawable.Drawable;
import kh.g4;
import org.telegram.ui.Components.gr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ws0;
public final class u0 implements xf.b1 {
    public final v0 f50124a;

    public u0(v0 v0Var) {
        this.f50124a = v0Var;
    }

    @Override
    public final void a() {
        v0 v0Var = this.f50124a;
        v0Var.f50131e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new g4(v0Var, 19)).setInterpolator(gr.h);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void e() {
        v0 v0Var = this.f50124a;
        v0Var.f50129b.f49381a.e();
        v0Var.f50136w.setViewHidden(false);
        PhotoViewer photoViewer = ((ws0) v0Var).G;
        Drawable[] drawableArr = PhotoViewer.P8;
        photoViewer.X2(true, true);
    }

    @Override
    public final void f() {
        this.f50124a.f50136w.setViewHidden(true);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
