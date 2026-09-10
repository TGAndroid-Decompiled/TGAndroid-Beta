package pg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.wr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.yt0;
public final class v0 implements og.g1 {
    public final w0 f40321a;

    public v0(w0 w0Var) {
        this.f40321a = w0Var;
    }

    @Override
    public final void a() {
        w0 w0Var = this.f40321a;
        w0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new ai.a(w0Var, 24)).setInterpolator(wr.h);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void e() {
        w0 w0Var = this.f40321a;
        w0Var.f40333b.f14570a.e();
        w0Var.f40339w.setViewHidden(false);
        PhotoViewer photoViewer = ((yt0) w0Var).K;
        Drawable[] drawableArr = PhotoViewer.T8;
        photoViewer.X2(true, true);
    }

    @Override
    public final void f() {
        this.f40321a.f40339w.setViewHidden(true);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
