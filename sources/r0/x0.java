package r0;

import android.view.WindowInsets;
public class x0 extends a1 {
    public final WindowInsets.Builder f47144c;

    public x0() {
        this.f47144c = android.support.v4.media.session.x.h();
    }

    @Override
    public k1 b() {
        a();
        k1 h = k1.h(null, this.f47144c.build());
        h.f47115a.q(this.f47071b);
        return h;
    }

    @Override
    public void d(i0.b bVar) {
        this.f47144c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override
    public void e(i0.b bVar) {
        this.f47144c.setStableInsets(bVar.d());
    }

    @Override
    public void f(i0.b bVar) {
        this.f47144c.setSystemGestureInsets(bVar.d());
    }

    @Override
    public void g(i0.b bVar) {
        this.f47144c.setSystemWindowInsets(bVar.d());
    }

    @Override
    public void h(i0.b bVar) {
        this.f47144c.setTappableElementInsets(bVar.d());
    }

    public x0(k1 k1Var) {
        super(k1Var);
        WindowInsets.Builder h;
        WindowInsets g7 = k1Var.g();
        if (g7 != null) {
            h = android.support.v4.media.session.x.i(g7);
        } else {
            h = android.support.v4.media.session.x.h();
        }
        this.f47144c = h;
    }
}
