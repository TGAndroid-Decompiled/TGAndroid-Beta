package r0;

import android.view.WindowInsets;
public class y0 extends b1 {
    public final WindowInsets.Builder f42170c;

    public y0() {
        this.f42170c = ah.e.h();
    }

    @Override
    public l1 b() {
        a();
        l1 h = l1.h(null, this.f42170c.build());
        h.f42139a.q(this.f42098b);
        return h;
    }

    @Override
    public void d(i0.b bVar) {
        this.f42170c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override
    public void e(i0.b bVar) {
        this.f42170c.setStableInsets(bVar.d());
    }

    @Override
    public void f(i0.b bVar) {
        this.f42170c.setSystemGestureInsets(bVar.d());
    }

    @Override
    public void g(i0.b bVar) {
        this.f42170c.setSystemWindowInsets(bVar.d());
    }

    @Override
    public void h(i0.b bVar) {
        this.f42170c.setTappableElementInsets(bVar.d());
    }

    public y0(l1 l1Var) {
        super(l1Var);
        WindowInsets.Builder h;
        WindowInsets g10 = l1Var.g();
        if (g10 != null) {
            h = ah.e.i(g10);
        } else {
            h = ah.e.h();
        }
        this.f42170c = h;
    }
}
