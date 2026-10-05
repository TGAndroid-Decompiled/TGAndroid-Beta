package r0;

import android.view.WindowInsets;
public class y0 extends b1 {
    public final WindowInsets.Builder f45661c;

    public y0() {
        this.f45661c = ah.f.h();
    }

    @Override
    public l1 b() {
        a();
        l1 h = l1.h(null, this.f45661c.build());
        h.f45624a.q(this.f45578b);
        return h;
    }

    @Override
    public void d(i0.b bVar) {
        this.f45661c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override
    public void e(i0.b bVar) {
        this.f45661c.setStableInsets(bVar.d());
    }

    @Override
    public void f(i0.b bVar) {
        this.f45661c.setSystemGestureInsets(bVar.d());
    }

    @Override
    public void g(i0.b bVar) {
        this.f45661c.setSystemWindowInsets(bVar.d());
    }

    @Override
    public void h(i0.b bVar) {
        this.f45661c.setTappableElementInsets(bVar.d());
    }

    public y0(l1 l1Var) {
        super(l1Var);
        WindowInsets.Builder h;
        WindowInsets g10 = l1Var.g();
        if (g10 != null) {
            h = ah.f.i(g10);
        } else {
            h = ah.f.h();
        }
        this.f45661c = h;
    }
}
