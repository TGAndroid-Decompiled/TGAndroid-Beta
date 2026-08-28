package r0;

import android.view.WindowInsets;
public class z0 extends c1 {
    public final WindowInsets.Builder f46966c;

    public z0() {
        this.f46966c = android.support.v4.media.session.z.g();
    }

    @Override
    public m1 b() {
        a();
        m1 h = m1.h(null, this.f46966c.build());
        h.f46929a.q(this.f46881b);
        return h;
    }

    @Override
    public void d(i0.b bVar) {
        this.f46966c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override
    public void e(i0.b bVar) {
        this.f46966c.setStableInsets(bVar.d());
    }

    @Override
    public void f(i0.b bVar) {
        this.f46966c.setSystemGestureInsets(bVar.d());
    }

    @Override
    public void g(i0.b bVar) {
        this.f46966c.setSystemWindowInsets(bVar.d());
    }

    @Override
    public void h(i0.b bVar) {
        this.f46966c.setTappableElementInsets(bVar.d());
    }

    public z0(m1 m1Var) {
        super(m1Var);
        WindowInsets.Builder g10;
        WindowInsets g11 = m1Var.g();
        if (g11 != null) {
            g10 = android.support.v4.media.session.z.h(g11);
        } else {
            g10 = android.support.v4.media.session.z.g();
        }
        this.f46966c = g10;
    }
}
