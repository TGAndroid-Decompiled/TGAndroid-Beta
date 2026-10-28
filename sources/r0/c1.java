package r0;

import android.view.WindowInsets;
public class c1 extends b1 {
    public i0.b f47121n;

    public c1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f47121n = null;
    }

    @Override
    public k1 b() {
        return k1.h(null, this.f47118c.consumeStableInsets());
    }

    @Override
    public k1 c() {
        return k1.h(null, this.f47118c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f47121n == null) {
            WindowInsets windowInsets = this.f47118c;
            this.f47121n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f47121n;
    }

    @Override
    public boolean n() {
        return this.f47118c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f47121n = bVar;
    }
}
