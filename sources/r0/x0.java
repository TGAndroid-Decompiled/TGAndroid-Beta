package r0;

import android.view.WindowInsets;
public class x0 extends a1 {
    public final WindowInsets.Builder f46810c;

    public x0() {
        this.f46810c = ah.e.h();
    }

    @Override
    public k1 b() {
        a();
        k1 h = k1.h(null, this.f46810c.build());
        h.f46775a.q(this.f46727b);
        return h;
    }

    @Override
    public void d(i0.b bVar) {
        this.f46810c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override
    public void e(i0.b bVar) {
        this.f46810c.setStableInsets(bVar.d());
    }

    @Override
    public void f(i0.b bVar) {
        this.f46810c.setSystemGestureInsets(bVar.d());
    }

    @Override
    public void g(i0.b bVar) {
        this.f46810c.setSystemWindowInsets(bVar.d());
    }

    @Override
    public void h(i0.b bVar) {
        this.f46810c.setTappableElementInsets(bVar.d());
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
        this.f46810c = h;
    }
}
