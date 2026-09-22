package r0;

import android.view.WindowInsets;
public class d1 extends c1 {
    public i0.b f41819n;

    public d1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f41819n = null;
    }

    @Override
    public l1 b() {
        return l1.h(null, this.f41816c.consumeStableInsets());
    }

    @Override
    public l1 c() {
        return l1.h(null, this.f41816c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f41819n == null) {
            WindowInsets windowInsets = this.f41816c;
            this.f41819n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f41819n;
    }

    @Override
    public boolean n() {
        return this.f41816c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f41819n = bVar;
    }
}
