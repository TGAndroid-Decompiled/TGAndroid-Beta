package r0;

import android.view.WindowInsets;
public class c1 extends b1 {
    public i0.b f46866n;

    public c1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f46866n = null;
    }

    @Override
    public k1 b() {
        return k1.h(null, this.f46862c.consumeStableInsets());
    }

    @Override
    public k1 c() {
        return k1.h(null, this.f46862c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f46866n == null) {
            WindowInsets windowInsets = this.f46862c;
            this.f46866n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f46866n;
    }

    @Override
    public boolean n() {
        return this.f46862c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f46866n = bVar;
    }
}
