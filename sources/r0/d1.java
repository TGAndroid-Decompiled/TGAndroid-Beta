package r0;

import android.view.WindowInsets;
public class d1 extends c1 {
    public i0.b f45573n;

    public d1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f45573n = null;
    }

    @Override
    public l1 b() {
        return l1.h(null, this.f45569c.consumeStableInsets());
    }

    @Override
    public l1 c() {
        return l1.h(null, this.f45569c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f45573n == null) {
            WindowInsets windowInsets = this.f45569c;
            this.f45573n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f45573n;
    }

    @Override
    public boolean n() {
        return this.f45569c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f45573n = bVar;
    }
}
