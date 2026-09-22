package r0;

import android.view.WindowInsets;
public class d1 extends c1 {
    public i0.b f42143n;

    public d1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f42143n = null;
    }

    @Override
    public l1 b() {
        return l1.h(null, this.f42140c.consumeStableInsets());
    }

    @Override
    public l1 c() {
        return l1.h(null, this.f42140c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f42143n == null) {
            WindowInsets windowInsets = this.f42140c;
            this.f42143n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f42143n;
    }

    @Override
    public boolean n() {
        return this.f42140c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f42143n = bVar;
    }
}
