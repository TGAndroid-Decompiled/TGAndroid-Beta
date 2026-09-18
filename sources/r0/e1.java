package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f42081n;

    public e1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
        this.f42081n = null;
    }

    @Override
    public m1 b() {
        return m1.h(null, this.f42074c.consumeStableInsets());
    }

    @Override
    public m1 c() {
        return m1.h(null, this.f42074c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f42081n == null) {
            WindowInsets windowInsets = this.f42074c;
            this.f42081n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f42081n;
    }

    @Override
    public boolean n() {
        return this.f42074c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f42081n = bVar;
    }
}
