package r0;

import android.view.WindowInsets;
public class d1 extends c1 {
    public i0.b f42094n;

    public d1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f42094n = null;
    }

    @Override
    public l1 b() {
        return l1.h(null, this.f42091c.consumeStableInsets());
    }

    @Override
    public l1 c() {
        return l1.h(null, this.f42091c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f42094n == null) {
            WindowInsets windowInsets = this.f42091c;
            this.f42094n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f42094n;
    }

    @Override
    public boolean n() {
        return this.f42091c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f42094n = bVar;
    }
}
