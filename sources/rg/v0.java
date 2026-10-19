package rg;

import android.graphics.drawable.Drawable;
import ei.i6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ft0;
public final class v0 implements qg.e1 {
    public final w0 f45660a;

    public v0(w0 w0Var) {
        this.f45660a = w0Var;
    }

    @Override
    public final void a() {
        w0 w0Var = this.f45660a;
        w0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new i6(w0Var, 16)).setInterpolator(bs.h);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void e() {
        w0 w0Var = this.f45660a;
        w0Var.f45672b.f44687a.e();
        w0Var.f45678w.setViewHidden(false);
        PhotoViewer photoViewer = ((ft0) w0Var).K;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.X2(true, true);
    }

    @Override
    public final void f() {
        this.f45660a.f45678w.setViewHidden(true);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
