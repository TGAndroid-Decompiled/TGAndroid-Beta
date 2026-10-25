package r0;

import android.view.WindowInsets;
public class c1 extends b1 {
    public i0.b f47083n;

    public c1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f47083n = null;
    }

    @Override
    public k1 b() {
        return k1.h(null, this.f47080c.consumeStableInsets());
    }

    @Override
    public k1 c() {
        return k1.h(null, this.f47080c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f47083n == null) {
            WindowInsets windowInsets = this.f47080c;
            this.f47083n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f47083n;
    }

    @Override
    public boolean n() {
        return this.f47080c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f47083n = bVar;
    }
}
