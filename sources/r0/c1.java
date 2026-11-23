package r0;

import android.view.WindowInsets;
public class c1 extends b1 {
    public i0.b f56237n;

    public c1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f56237n = null;
    }

    @Override
    public l1 b() {
        return l1.h(null, this.f56233c.consumeStableInsets());
    }

    @Override
    public l1 c() {
        return l1.h(null, this.f56233c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f56237n == null) {
            WindowInsets windowInsets = this.f56233c;
            this.f56237n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f56237n;
    }

    @Override
    public boolean n() {
        return this.f56233c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f56237n = bVar;
    }
}
