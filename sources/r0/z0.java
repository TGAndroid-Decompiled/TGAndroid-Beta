package r0;

import android.view.WindowInsets;
public class z0 extends c1 {
    public final WindowInsets.Builder f43161c;

    public z0() {
        this.f43161c = android.support.v4.media.session.y.g();
    }

    @Override
    public m1 b() {
        a();
        m1 h = m1.h(null, this.f43161c.build());
        h.f43130a.q(this.f43087b);
        return h;
    }

    @Override
    public void d(i0.b bVar) {
        this.f43161c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override
    public void e(i0.b bVar) {
        this.f43161c.setStableInsets(bVar.d());
    }

    @Override
    public void f(i0.b bVar) {
        this.f43161c.setSystemGestureInsets(bVar.d());
    }

    @Override
    public void g(i0.b bVar) {
        this.f43161c.setSystemWindowInsets(bVar.d());
    }

    @Override
    public void h(i0.b bVar) {
        this.f43161c.setTappableElementInsets(bVar.d());
    }

    public z0(m1 m1Var) {
        super(m1Var);
        WindowInsets.Builder g10;
        WindowInsets g11 = m1Var.g();
        if (g11 != null) {
            g10 = android.support.v4.media.session.y.h(g11);
        } else {
            g10 = android.support.v4.media.session.y.g();
        }
        this.f43161c = g10;
    }
}
