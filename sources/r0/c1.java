package r0;

import android.view.WindowInsets;
public class c1 extends b1 {
    public i0.b f45219n;

    public c1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f45219n = null;
    }

    @Override
    public k1 b() {
        return k1.h(null, this.f45216c.consumeStableInsets());
    }

    @Override
    public k1 c() {
        return k1.h(null, this.f45216c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f45219n == null) {
            WindowInsets windowInsets = this.f45216c;
            this.f45219n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f45219n;
    }

    @Override
    public boolean n() {
        return this.f45216c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f45219n = bVar;
    }
}
