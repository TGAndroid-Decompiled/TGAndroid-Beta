package r0;

import android.view.WindowInsets;
public class x0 extends a1 {
    public final WindowInsets.Builder f46902c;

    public x0() {
        this.f46902c = ah.e.h();
    }

    @Override
    public k1 b() {
        a();
        k1 h = k1.h(null, this.f46902c.build());
        h.f46867a.q(this.f46819b);
        return h;
    }

    @Override
    public void d(i0.b bVar) {
        this.f46902c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override
    public void e(i0.b bVar) {
        this.f46902c.setStableInsets(bVar.d());
    }

    @Override
    public void f(i0.b bVar) {
        this.f46902c.setSystemGestureInsets(bVar.d());
    }

    @Override
    public void g(i0.b bVar) {
        this.f46902c.setSystemWindowInsets(bVar.d());
    }

    @Override
    public void h(i0.b bVar) {
        this.f46902c.setTappableElementInsets(bVar.d());
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
        this.f46902c = h;
    }
}
