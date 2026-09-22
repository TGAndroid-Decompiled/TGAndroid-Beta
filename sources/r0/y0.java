package r0;

import android.view.WindowInsets;
public class y0 extends b1 {
    public final WindowInsets.Builder f41882c;

    public y0() {
        this.f41882c = ah.e.h();
    }

    @Override
    public l1 b() {
        a();
        l1 h = l1.h(null, this.f41882c.build());
        h.f41851a.q(this.f41810b);
        return h;
    }

    @Override
    public void d(i0.b bVar) {
        this.f41882c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override
    public void e(i0.b bVar) {
        this.f41882c.setStableInsets(bVar.d());
    }

    @Override
    public void f(i0.b bVar) {
        this.f41882c.setSystemGestureInsets(bVar.d());
    }

    @Override
    public void g(i0.b bVar) {
        this.f41882c.setSystemWindowInsets(bVar.d());
    }

    @Override
    public void h(i0.b bVar) {
        this.f41882c.setTappableElementInsets(bVar.d());
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
        this.f41882c = h;
    }
}
