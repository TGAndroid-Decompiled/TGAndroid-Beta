package r0;

import android.view.WindowInsets;
public class c1 extends b1 {
    public i0.b f46965n;

    public c1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f46965n = null;
    }

    @Override
    public k1 b() {
        return k1.h(null, this.f46961c.consumeStableInsets());
    }

    @Override
    public k1 c() {
        return k1.h(null, this.f46961c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f46965n == null) {
            WindowInsets windowInsets = this.f46961c;
            this.f46965n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f46965n;
    }

    @Override
    public boolean n() {
        return this.f46961c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f46965n = bVar;
    }
}
