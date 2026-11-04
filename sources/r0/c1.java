package r0;

import android.view.WindowInsets;
public class c1 extends b1 {
    public i0.b f53997n;

    public c1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f53997n = null;
    }

    @Override
    public k1 b() {
        return k1.h(null, this.f53993c.consumeStableInsets());
    }

    @Override
    public k1 c() {
        return k1.h(null, this.f53993c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f53997n == null) {
            WindowInsets windowInsets = this.f53993c;
            this.f53997n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f53997n;
    }

    @Override
    public boolean n() {
        return this.f53993c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f53997n = bVar;
    }
}
