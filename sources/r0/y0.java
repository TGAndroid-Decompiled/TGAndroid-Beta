package r0;

import android.view.WindowInsets;
public class y0 extends b1 {
    public final WindowInsets.Builder f44748c;

    public y0() {
        this.f44748c = android.support.v4.media.session.y.h();
    }

    @Override
    public l1 b() {
        a();
        l1 h = l1.h(null, this.f44748c.build());
        h.f44711a.q(this.f44665b);
        return h;
    }

    @Override
    public void d(i0.c cVar) {
        this.f44748c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override
    public void e(i0.c cVar) {
        this.f44748c.setStableInsets(cVar.d());
    }

    @Override
    public void f(i0.c cVar) {
        this.f44748c.setSystemGestureInsets(cVar.d());
    }

    @Override
    public void g(i0.c cVar) {
        this.f44748c.setSystemWindowInsets(cVar.d());
    }

    @Override
    public void h(i0.c cVar) {
        this.f44748c.setTappableElementInsets(cVar.d());
    }

    public y0(l1 l1Var) {
        super(l1Var);
        WindowInsets.Builder h;
        WindowInsets g10 = l1Var.g();
        if (g10 != null) {
            h = android.support.v4.media.session.y.i(g10);
        } else {
            h = android.support.v4.media.session.y.h();
        }
        this.f44748c = h;
    }
}
