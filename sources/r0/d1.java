package r0;

import android.view.WindowInsets;
public class d1 extends c1 {
    public i0.b f42213n;

    public d1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f42213n = null;
    }

    @Override
    public l1 b() {
        return l1.h(null, this.f42210c.consumeStableInsets());
    }

    @Override
    public l1 c() {
        return l1.h(null, this.f42210c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f42213n == null) {
            WindowInsets windowInsets = this.f42210c;
            this.f42213n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f42213n;
    }

    @Override
    public boolean n() {
        return this.f42210c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f42213n = bVar;
    }
}
