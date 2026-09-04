package r0;

import android.view.WindowInsets;
public class d1 extends c1 {
    public i0.c f44675n;

    public d1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f44675n = null;
    }

    @Override
    public l1 b() {
        return l1.h(null, this.f44671c.consumeStableInsets());
    }

    @Override
    public l1 c() {
        return l1.h(null, this.f44671c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.c i() {
        if (this.f44675n == null) {
            WindowInsets windowInsets = this.f44671c;
            this.f44675n = i0.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f44675n;
    }

    @Override
    public boolean n() {
        return this.f44671c.isConsumed();
    }

    @Override
    public void s(i0.c cVar) {
        this.f44675n = cVar;
    }
}
