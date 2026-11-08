package r0;

import android.view.WindowInsets;
public class c1 extends b1 {
    public i0.b f54172n;

    public c1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f54172n = null;
    }

    @Override
    public k1 b() {
        return k1.h(null, this.f54168c.consumeStableInsets());
    }

    @Override
    public k1 c() {
        return k1.h(null, this.f54168c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f54172n == null) {
            WindowInsets windowInsets = this.f54168c;
            this.f54172n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f54172n;
    }

    @Override
    public boolean n() {
        return this.f54168c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f54172n = bVar;
    }
}
