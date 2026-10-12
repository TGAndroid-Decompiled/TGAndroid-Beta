package r0;

import android.view.WindowInsets;
public class d1 extends c1 {
    public i0.b f43709n;

    public d1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f43709n = null;
    }

    @Override
    public l1 b() {
        return l1.h(null, this.f43706c.consumeStableInsets());
    }

    @Override
    public l1 c() {
        return l1.h(null, this.f43706c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f43709n == null) {
            WindowInsets windowInsets = this.f43706c;
            this.f43709n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f43709n;
    }

    @Override
    public boolean n() {
        return this.f43706c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f43709n = bVar;
    }
}
