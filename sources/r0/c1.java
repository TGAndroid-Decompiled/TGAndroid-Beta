package r0;

import android.view.WindowInsets;
public class c1 extends b1 {
    public i0.b f45220n;

    public c1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f45220n = null;
    }

    @Override
    public k1 b() {
        return k1.h(null, this.f45217c.consumeStableInsets());
    }

    @Override
    public k1 c() {
        return k1.h(null, this.f45217c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f45220n == null) {
            WindowInsets windowInsets = this.f45217c;
            this.f45220n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f45220n;
    }

    @Override
    public boolean n() {
        return this.f45217c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f45220n = bVar;
    }
}
