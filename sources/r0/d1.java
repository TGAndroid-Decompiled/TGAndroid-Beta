package r0;

import android.view.WindowInsets;
public class d1 extends c1 {
    public i0.c f44703n;

    public d1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f44703n = null;
    }

    @Override
    public l1 b() {
        return l1.h(null, this.f44699c.consumeStableInsets());
    }

    @Override
    public l1 c() {
        return l1.h(null, this.f44699c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.c i() {
        if (this.f44703n == null) {
            WindowInsets windowInsets = this.f44699c;
            this.f44703n = i0.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f44703n;
    }

    @Override
    public boolean n() {
        return this.f44699c.isConsumed();
    }

    @Override
    public void s(i0.c cVar) {
        this.f44703n = cVar;
    }
}
