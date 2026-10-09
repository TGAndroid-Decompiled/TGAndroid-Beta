package r0;

import android.view.WindowInsets;
public class c1 extends b1 {
    public i0.b f46742n;

    public c1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f46742n = null;
    }

    @Override
    public k1 b() {
        return k1.h(null, this.f46738c.consumeStableInsets());
    }

    @Override
    public k1 c() {
        return k1.h(null, this.f46738c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f46742n == null) {
            WindowInsets windowInsets = this.f46738c;
            this.f46742n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f46742n;
    }

    @Override
    public boolean n() {
        return this.f46738c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f46742n = bVar;
    }
}
