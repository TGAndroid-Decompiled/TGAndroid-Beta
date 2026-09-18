package r0;

import android.view.WindowInsets;
public class z0 extends c1 {
    public final WindowInsets.Builder f42144c;

    public z0() {
        this.f42144c = ah.f.h();
    }

    @Override
    public m1 b() {
        a();
        m1 h = m1.h(null, this.f42144c.build());
        h.f42109a.q(this.f42068b);
        return h;
    }

    @Override
    public void d(i0.b bVar) {
        this.f42144c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override
    public void e(i0.b bVar) {
        this.f42144c.setStableInsets(bVar.d());
    }

    @Override
    public void f(i0.b bVar) {
        this.f42144c.setSystemGestureInsets(bVar.d());
    }

    @Override
    public void g(i0.b bVar) {
        this.f42144c.setSystemWindowInsets(bVar.d());
    }

    @Override
    public void h(i0.b bVar) {
        this.f42144c.setTappableElementInsets(bVar.d());
    }

    public z0(m1 m1Var) {
        super(m1Var);
        WindowInsets.Builder h;
        WindowInsets g10 = m1Var.g();
        if (g10 != null) {
            h = ah.f.i(g10);
        } else {
            h = ah.f.h();
        }
        this.f42144c = h;
    }
}
