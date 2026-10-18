package r0;

import android.view.WindowInsets;
public class c1 extends b1 {
    public i0.b f44842n;

    public c1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f44842n = null;
    }

    @Override
    public k1 b() {
        return k1.h(null, this.f44839c.consumeStableInsets());
    }

    @Override
    public k1 c() {
        return k1.h(null, this.f44839c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f44842n == null) {
            WindowInsets windowInsets = this.f44839c;
            this.f44842n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f44842n;
    }

    @Override
    public boolean n() {
        return this.f44839c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f44842n = bVar;
    }
}
