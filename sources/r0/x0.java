package r0;

import android.view.WindowInsets;
public class x0 extends a1 {
    public final WindowInsets.Builder f54146c;

    public x0() {
        this.f54146c = android.support.v4.media.session.w.h();
    }

    @Override
    public k1 b() {
        a();
        k1 h = k1.h(null, this.f54146c.build());
        h.f54108a.q(this.f54066b);
        return h;
    }

    @Override
    public void d(i0.b bVar) {
        this.f54146c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override
    public void e(i0.b bVar) {
        this.f54146c.setStableInsets(bVar.d());
    }

    @Override
    public void f(i0.b bVar) {
        this.f54146c.setSystemGestureInsets(bVar.d());
    }

    @Override
    public void g(i0.b bVar) {
        this.f54146c.setSystemWindowInsets(bVar.d());
    }

    @Override
    public void h(i0.b bVar) {
        this.f54146c.setTappableElementInsets(bVar.d());
    }

    public x0(k1 k1Var) {
        super(k1Var);
        WindowInsets.Builder h;
        WindowInsets g10 = k1Var.g();
        if (g10 != null) {
            h = android.support.v4.media.session.w.i(g10);
        } else {
            h = android.support.v4.media.session.w.h();
        }
        this.f54146c = h;
    }
}
