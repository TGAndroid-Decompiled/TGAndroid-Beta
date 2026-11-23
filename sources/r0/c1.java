package r0;

import android.view.WindowInsets;
public class c1 extends b1 {
    public i0.b f56272n;

    public c1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f56272n = null;
    }

    @Override
    public l1 b() {
        return l1.h(null, this.f56268c.consumeStableInsets());
    }

    @Override
    public l1 c() {
        return l1.h(null, this.f56268c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f56272n == null) {
            WindowInsets windowInsets = this.f56268c;
            this.f56272n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f56272n;
    }

    @Override
    public boolean n() {
        return this.f56268c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f56272n = bVar;
    }
}
