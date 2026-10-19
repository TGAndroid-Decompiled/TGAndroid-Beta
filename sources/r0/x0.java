package r0;

import android.view.WindowInsets;
public class x0 extends a1 {
    public final WindowInsets.Builder f44856c;

    public x0() {
        this.f44856c = android.support.v4.media.session.x.h();
    }

    @Override
    public k1 b() {
        a();
        k1 h = k1.h(null, this.f44856c.build());
        h.f44827a.q(this.f44784b);
        return h;
    }

    @Override
    public void d(i0.b bVar) {
        this.f44856c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override
    public void e(i0.b bVar) {
        this.f44856c.setStableInsets(bVar.d());
    }

    @Override
    public void f(i0.b bVar) {
        this.f44856c.setSystemGestureInsets(bVar.d());
    }

    @Override
    public void g(i0.b bVar) {
        this.f44856c.setSystemWindowInsets(bVar.d());
    }

    @Override
    public void h(i0.b bVar) {
        this.f44856c.setTappableElementInsets(bVar.d());
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
        this.f44856c = h;
    }
}
