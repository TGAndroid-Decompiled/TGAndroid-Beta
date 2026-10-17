package r0;

import android.view.WindowInsets;
public class x0 extends a1 {
    public final WindowInsets.Builder f44882c;

    public x0() {
        this.f44882c = android.support.v4.media.session.x.h();
    }

    @Override
    public k1 b() {
        a();
        k1 h = k1.h(null, this.f44882c.build());
        h.f44853a.q(this.f44810b);
        return h;
    }

    @Override
    public void d(i0.c cVar) {
        this.f44882c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override
    public void e(i0.c cVar) {
        this.f44882c.setStableInsets(cVar.d());
    }

    @Override
    public void f(i0.c cVar) {
        this.f44882c.setSystemGestureInsets(cVar.d());
    }

    @Override
    public void g(i0.c cVar) {
        this.f44882c.setSystemWindowInsets(cVar.d());
    }

    @Override
    public void h(i0.c cVar) {
        this.f44882c.setTappableElementInsets(cVar.d());
    }

    public x0(k1 k1Var) {
        super(k1Var);
        WindowInsets.Builder h;
        WindowInsets g10 = k1Var.g();
        if (g10 != null) {
            h = android.support.v4.media.session.x.i(g10);
        } else {
            h = android.support.v4.media.session.x.h();
        }
        this.f44882c = h;
    }
}
