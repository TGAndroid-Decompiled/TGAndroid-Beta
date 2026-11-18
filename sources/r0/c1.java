package r0;

import android.view.WindowInsets;
public class c1 extends b1 {
    public i0.b f56227n;

    public c1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f56227n = null;
    }

    @Override
    public l1 b() {
        return l1.h(null, this.f56223c.consumeStableInsets());
    }

    @Override
    public l1 c() {
        return l1.h(null, this.f56223c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f56227n == null) {
            WindowInsets windowInsets = this.f56223c;
            this.f56227n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f56227n;
    }

    @Override
    public boolean n() {
        return this.f56223c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f56227n = bVar;
    }
}
