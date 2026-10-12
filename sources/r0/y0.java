package r0;

import android.view.WindowInsets;
public class y0 extends b1 {
    public final WindowInsets.Builder f43770c;

    public y0() {
        this.f43770c = android.support.v4.media.session.x.h();
    }

    @Override
    public l1 b() {
        a();
        l1 h = l1.h(null, this.f43770c.build());
        h.f43741a.q(this.f43700b);
        return h;
    }

    @Override
    public void d(i0.b bVar) {
        this.f43770c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override
    public void e(i0.b bVar) {
        this.f43770c.setStableInsets(bVar.d());
    }

    @Override
    public void f(i0.b bVar) {
        this.f43770c.setSystemGestureInsets(bVar.d());
    }

    @Override
    public void g(i0.b bVar) {
        this.f43770c.setSystemWindowInsets(bVar.d());
    }

    @Override
    public void h(i0.b bVar) {
        this.f43770c.setTappableElementInsets(bVar.d());
    }

    public y0(l1 l1Var) {
        super(l1Var);
        WindowInsets.Builder h;
        WindowInsets g10 = l1Var.g();
        if (g10 != null) {
            h = android.support.v4.media.session.x.i(g10);
        } else {
            h = android.support.v4.media.session.x.h();
        }
        this.f43770c = h;
    }
}
