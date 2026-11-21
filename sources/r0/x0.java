package r0;

import android.view.WindowInsets;
public class x0 extends a1 {
    public final WindowInsets.Builder f56336c;

    public x0() {
        this.f56336c = android.support.v4.media.session.w.h();
    }

    @Override
    public l1 b() {
        a();
        l1 h = l1.h(null, this.f56336c.build());
        h.f56299a.q(this.f56255b);
        return h;
    }

    @Override
    public void d(i0.b bVar) {
        this.f56336c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override
    public void e(i0.b bVar) {
        this.f56336c.setStableInsets(bVar.d());
    }

    @Override
    public void f(i0.b bVar) {
        this.f56336c.setSystemGestureInsets(bVar.d());
    }

    @Override
    public void g(i0.b bVar) {
        this.f56336c.setSystemWindowInsets(bVar.d());
    }

    @Override
    public void h(i0.b bVar) {
        this.f56336c.setTappableElementInsets(bVar.d());
    }

    public x0(l1 l1Var) {
        super(l1Var);
        WindowInsets.Builder h;
        WindowInsets g10 = l1Var.g();
        if (g10 != null) {
            h = android.support.v4.media.session.w.i(g10);
        } else {
            h = android.support.v4.media.session.w.h();
        }
        this.f56336c = h;
    }
}
