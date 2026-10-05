package r0;

import android.view.WindowInsets;
public class d1 extends c1 {
    public i0.b f45588n;

    public d1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f45588n = null;
    }

    @Override
    public l1 b() {
        return l1.h(null, this.f45584c.consumeStableInsets());
    }

    @Override
    public l1 c() {
        return l1.h(null, this.f45584c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f45588n == null) {
            WindowInsets windowInsets = this.f45584c;
            this.f45588n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f45588n;
    }

    @Override
    public boolean n() {
        return this.f45584c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f45588n = bVar;
    }
}
