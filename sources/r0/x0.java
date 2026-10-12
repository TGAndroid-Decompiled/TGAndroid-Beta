package r0;

import android.view.WindowInsets;
public class x0 extends a1 {
    public final WindowInsets.Builder f47035c;

    public x0() {
        this.f47035c = ah.e.h();
    }

    @Override
    public k1 b() {
        a();
        k1 h = k1.h(null, this.f47035c.build());
        h.f47000a.q(this.f46952b);
        return h;
    }

    @Override
    public void d(i0.b bVar) {
        this.f47035c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override
    public void e(i0.b bVar) {
        this.f47035c.setStableInsets(bVar.d());
    }

    @Override
    public void f(i0.b bVar) {
        this.f47035c.setSystemGestureInsets(bVar.d());
    }

    @Override
    public void g(i0.b bVar) {
        this.f47035c.setSystemWindowInsets(bVar.d());
    }

    @Override
    public void h(i0.b bVar) {
        this.f47035c.setTappableElementInsets(bVar.d());
    }

    public x0(k1 k1Var) {
        super(k1Var);
        WindowInsets.Builder h;
        WindowInsets g10 = k1Var.g();
        if (g10 != null) {
            h = ah.e.i(g10);
        } else {
            h = ah.e.h();
        }
        this.f47035c = h;
    }
}
