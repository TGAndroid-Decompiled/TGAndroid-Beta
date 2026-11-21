package r0;

import android.view.WindowInsets;
public class c1 extends b1 {
    public i0.b f56268n;

    public c1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f56268n = null;
    }

    @Override
    public l1 b() {
        return l1.h(null, this.f56264c.consumeStableInsets());
    }

    @Override
    public l1 c() {
        return l1.h(null, this.f56264c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f56268n == null) {
            WindowInsets windowInsets = this.f56264c;
            this.f56268n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f56268n;
    }

    @Override
    public boolean n() {
        return this.f56264c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f56268n = bVar;
    }
}
