package r0;

import android.view.WindowInsets;
public class d1 extends c1 {
    public i0.b f43465n;

    public d1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f43465n = null;
    }

    @Override
    public l1 b() {
        return l1.h(null, this.f43462c.consumeStableInsets());
    }

    @Override
    public l1 c() {
        return l1.h(null, this.f43462c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f43465n == null) {
            WindowInsets windowInsets = this.f43462c;
            this.f43465n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f43465n;
    }

    @Override
    public boolean n() {
        return this.f43462c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f43465n = bVar;
    }
}
