package r0;

import android.view.WindowInsets;
public class x0 extends a1 {
    public final WindowInsets.Builder f54064c;

    public x0() {
        this.f54064c = android.support.v4.media.session.w.h();
    }

    @Override
    public k1 b() {
        a();
        k1 h = k1.h(null, this.f54064c.build());
        h.f54026a.q(this.f53984b);
        return h;
    }

    @Override
    public void d(i0.b bVar) {
        this.f54064c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override
    public void e(i0.b bVar) {
        this.f54064c.setStableInsets(bVar.d());
    }

    @Override
    public void f(i0.b bVar) {
        this.f54064c.setSystemGestureInsets(bVar.d());
    }

    @Override
    public void g(i0.b bVar) {
        this.f54064c.setSystemWindowInsets(bVar.d());
    }

    @Override
    public void h(i0.b bVar) {
        this.f54064c.setTappableElementInsets(bVar.d());
    }

    public x0(k1 k1Var) {
        super(k1Var);
        WindowInsets.Builder h;
        WindowInsets g7 = k1Var.g();
        if (g7 != null) {
            h = android.support.v4.media.session.w.i(g7);
        } else {
            h = android.support.v4.media.session.w.h();
        }
        this.f54064c = h;
    }
}
