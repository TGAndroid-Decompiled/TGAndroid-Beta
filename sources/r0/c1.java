package r0;

import android.view.WindowInsets;
public class c1 extends b1 {
    public i0.b f54185n;

    public c1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f54185n = null;
    }

    @Override
    public k1 b() {
        return k1.h(null, this.f54181c.consumeStableInsets());
    }

    @Override
    public k1 c() {
        return k1.h(null, this.f54181c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f54185n == null) {
            WindowInsets windowInsets = this.f54181c;
            this.f54185n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f54185n;
    }

    @Override
    public boolean n() {
        return this.f54181c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f54185n = bVar;
    }
}
