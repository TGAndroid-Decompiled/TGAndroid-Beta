package r0;

import android.view.WindowInsets;
public class c1 extends b1 {
    public i0.b f44807n;

    public c1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f44807n = null;
    }

    @Override
    public k1 b() {
        return k1.h(null, this.f44804c.consumeStableInsets());
    }

    @Override
    public k1 c() {
        return k1.h(null, this.f44804c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f44807n == null) {
            WindowInsets windowInsets = this.f44804c;
            this.f44807n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f44807n;
    }

    @Override
    public boolean n() {
        return this.f44804c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f44807n = bVar;
    }
}
