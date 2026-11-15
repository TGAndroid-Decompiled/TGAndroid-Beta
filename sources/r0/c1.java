package r0;

import android.view.WindowInsets;
public class c1 extends b1 {
    public i0.c f55653n;

    public c1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f55653n = null;
    }

    @Override
    public k1 b() {
        return k1.h(null, this.f55649c.consumeStableInsets());
    }

    @Override
    public k1 c() {
        return k1.h(null, this.f55649c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.c i() {
        if (this.f55653n == null) {
            WindowInsets windowInsets = this.f55649c;
            this.f55653n = i0.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f55653n;
    }

    @Override
    public boolean n() {
        return this.f55649c.isConsumed();
    }

    @Override
    public void s(i0.c cVar) {
        this.f55653n = cVar;
    }
}
