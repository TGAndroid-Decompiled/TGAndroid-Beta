package r0;

import android.view.WindowInsets;
public class d1 extends c1 {
    public i0.c f41042n;

    public d1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f41042n = null;
    }

    @Override
    public l1 b() {
        return l1.h(null, this.f41039c.consumeStableInsets());
    }

    @Override
    public l1 c() {
        return l1.h(null, this.f41039c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.c i() {
        if (this.f41042n == null) {
            WindowInsets windowInsets = this.f41039c;
            this.f41042n = i0.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f41042n;
    }

    @Override
    public boolean n() {
        return this.f41039c.isConsumed();
    }

    @Override
    public void s(i0.c cVar) {
        this.f41042n = cVar;
    }
}
