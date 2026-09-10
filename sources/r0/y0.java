package r0;

import android.view.WindowInsets;
public class y0 extends b1 {
    public final WindowInsets.Builder f41105c;

    public y0() {
        this.f41105c = ah.b.h();
    }

    @Override
    public l1 b() {
        a();
        l1 h = l1.h(null, this.f41105c.build());
        h.f41074a.q(this.f41033b);
        return h;
    }

    @Override
    public void d(i0.c cVar) {
        this.f41105c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override
    public void e(i0.c cVar) {
        this.f41105c.setStableInsets(cVar.d());
    }

    @Override
    public void f(i0.c cVar) {
        this.f41105c.setSystemGestureInsets(cVar.d());
    }

    @Override
    public void g(i0.c cVar) {
        this.f41105c.setSystemWindowInsets(cVar.d());
    }

    @Override
    public void h(i0.c cVar) {
        this.f41105c.setTappableElementInsets(cVar.d());
    }

    public y0(l1 l1Var) {
        super(l1Var);
        WindowInsets.Builder h;
        WindowInsets g10 = l1Var.g();
        if (g10 != null) {
            h = ah.b.i(g10);
        } else {
            h = ah.b.h();
        }
        this.f41105c = h;
    }
}
