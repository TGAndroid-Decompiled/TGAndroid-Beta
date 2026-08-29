package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f46807n;

    public e1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
        this.f46807n = null;
    }

    @Override
    public m1 b() {
        return m1.h(null, this.f46803c.consumeStableInsets());
    }

    @Override
    public m1 c() {
        return m1.h(null, this.f46803c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f46807n == null) {
            WindowInsets windowInsets = this.f46803c;
            this.f46807n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f46807n;
    }

    @Override
    public boolean n() {
        return this.f46803c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f46807n = bVar;
    }
}
