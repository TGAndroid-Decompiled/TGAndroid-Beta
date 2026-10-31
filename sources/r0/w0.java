package r0;

import android.view.WindowInsets;
public class w0 extends z0 {
    public final WindowInsets.Builder f46161c;

    public w0() {
        this.f46161c = android.support.v4.media.session.w.h();
    }

    @Override
    public j1 b() {
        a();
        j1 h = j1.h(null, this.f46161c.build());
        h.f46132a.q(this.f46166b);
        return h;
    }

    @Override
    public void d(i0.c cVar) {
        this.f46161c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override
    public void e(i0.c cVar) {
        this.f46161c.setStableInsets(cVar.d());
    }

    @Override
    public void f(i0.c cVar) {
        this.f46161c.setSystemGestureInsets(cVar.d());
    }

    @Override
    public void g(i0.c cVar) {
        this.f46161c.setSystemWindowInsets(cVar.d());
    }

    @Override
    public void h(i0.c cVar) {
        this.f46161c.setTappableElementInsets(cVar.d());
    }

    public w0(j1 j1Var) {
        super(j1Var);
        WindowInsets.Builder h;
        WindowInsets g10 = j1Var.g();
        if (g10 != null) {
            h = android.support.v4.media.session.w.i(g10);
        } else {
            h = android.support.v4.media.session.w.h();
        }
        this.f46161c = h;
    }
}
