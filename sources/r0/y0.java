package r0;

import android.view.WindowInsets;
public class y0 extends b1 {
    public final WindowInsets.Builder f41886c;

    public y0() {
        this.f41886c = ah.e.h();
    }

    @Override
    public l1 b() {
        a();
        l1 h = l1.h(null, this.f41886c.build());
        h.f41855a.q(this.f41814b);
        return h;
    }

    @Override
    public void d(i0.b bVar) {
        this.f41886c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override
    public void e(i0.b bVar) {
        this.f41886c.setStableInsets(bVar.d());
    }

    @Override
    public void f(i0.b bVar) {
        this.f41886c.setSystemGestureInsets(bVar.d());
    }

    @Override
    public void g(i0.b bVar) {
        this.f41886c.setSystemWindowInsets(bVar.d());
    }

    @Override
    public void h(i0.b bVar) {
        this.f41886c.setTappableElementInsets(bVar.d());
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
        this.f41886c = h;
    }
}
