package r0;

import android.view.WindowInsets;
public class y0 extends b1 {
    public final WindowInsets.Builder f42185c;

    public y0() {
        this.f42185c = ah.f.h();
    }

    @Override
    public l1 b() {
        a();
        l1 h = l1.h(null, this.f42185c.build());
        h.f42154a.q(this.f42113b);
        return h;
    }

    @Override
    public void d(i0.b bVar) {
        this.f42185c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override
    public void e(i0.b bVar) {
        this.f42185c.setStableInsets(bVar.d());
    }

    @Override
    public void f(i0.b bVar) {
        this.f42185c.setSystemGestureInsets(bVar.d());
    }

    @Override
    public void g(i0.b bVar) {
        this.f42185c.setSystemWindowInsets(bVar.d());
    }

    @Override
    public void h(i0.b bVar) {
        this.f42185c.setTappableElementInsets(bVar.d());
    }

    public y0(l1 l1Var) {
        super(l1Var);
        WindowInsets.Builder h;
        WindowInsets g10 = l1Var.g();
        if (g10 != null) {
            h = ah.f.i(g10);
        } else {
            h = ah.f.h();
        }
        this.f42185c = h;
    }
}
