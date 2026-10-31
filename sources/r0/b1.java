package r0;

import android.view.WindowInsets;
public class b1 extends a1 {
    public i0.c f46106n;

    public b1(j1 j1Var, WindowInsets windowInsets) {
        super(j1Var, windowInsets);
        this.f46106n = null;
    }

    @Override
    public j1 b() {
        return j1.h(null, this.f46100c.consumeStableInsets());
    }

    @Override
    public j1 c() {
        return j1.h(null, this.f46100c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.c i() {
        if (this.f46106n == null) {
            WindowInsets windowInsets = this.f46100c;
            this.f46106n = i0.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f46106n;
    }

    @Override
    public boolean n() {
        return this.f46100c.isConsumed();
    }

    @Override
    public void s(i0.c cVar) {
        this.f46106n = cVar;
    }
}
