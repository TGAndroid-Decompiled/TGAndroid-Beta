package r0;

import android.view.WindowInsets;
public class c1 extends b1 {
    public i0.b f44796n;

    public c1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f44796n = null;
    }

    @Override
    public k1 b() {
        return k1.h(null, this.f44793c.consumeStableInsets());
    }

    @Override
    public k1 c() {
        return k1.h(null, this.f44793c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f44796n == null) {
            WindowInsets windowInsets = this.f44793c;
            this.f44796n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f44796n;
    }

    @Override
    public boolean n() {
        return this.f44793c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f44796n = bVar;
    }
}
