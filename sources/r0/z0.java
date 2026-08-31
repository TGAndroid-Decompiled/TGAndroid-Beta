package r0;

import android.view.WindowInsets;
public class z0 extends c1 {
    public final WindowInsets.Builder f46489c;

    public z0() {
        this.f46489c = android.support.v4.media.session.y.g();
    }

    @Override
    public m1 b() {
        a();
        m1 h = m1.h(null, this.f46489c.build());
        h.f46452a.q(this.f46404b);
        return h;
    }

    @Override
    public void d(i0.b bVar) {
        this.f46489c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override
    public void e(i0.b bVar) {
        this.f46489c.setStableInsets(bVar.d());
    }

    @Override
    public void f(i0.b bVar) {
        this.f46489c.setSystemGestureInsets(bVar.d());
    }

    @Override
    public void g(i0.b bVar) {
        this.f46489c.setSystemWindowInsets(bVar.d());
    }

    @Override
    public void h(i0.b bVar) {
        this.f46489c.setTappableElementInsets(bVar.d());
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
        this.f46489c = g10;
    }
}
