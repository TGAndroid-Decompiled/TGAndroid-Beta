package r0;

import android.view.WindowInsets;
public class c1 extends b1 {
    public i0.b f46832n;

    public c1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f46832n = null;
    }

    @Override
    public k1 b() {
        return k1.h(null, this.f46828c.consumeStableInsets());
    }

    @Override
    public k1 c() {
        return k1.h(null, this.f46828c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.b i() {
        if (this.f46832n == null) {
            WindowInsets windowInsets = this.f46828c;
            this.f46832n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f46832n;
    }

    @Override
    public boolean n() {
        return this.f46828c.isConsumed();
    }

    @Override
    public void s(i0.b bVar) {
        this.f46832n = bVar;
    }
}
