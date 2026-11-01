package r0;

import android.view.WindowInsets;
public class b1 extends a1 {
    public i0.c f46117n;

    public b1(j1 j1Var, WindowInsets windowInsets) {
        super(j1Var, windowInsets);
        this.f46117n = null;
    }

    @Override
    public j1 b() {
        return j1.h(null, this.f46111c.consumeStableInsets());
    }

    @Override
    public j1 c() {
        return j1.h(null, this.f46111c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.c i() {
        if (this.f46117n == null) {
            WindowInsets windowInsets = this.f46111c;
            this.f46117n = i0.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f46117n;
    }

    @Override
    public boolean n() {
        return this.f46111c.isConsumed();
    }

    @Override
    public void s(i0.c cVar) {
        this.f46117n = cVar;
    }
}
