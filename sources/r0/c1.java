package r0;

import android.view.WindowInsets;
public class c1 extends b1 {
    public i0.c f44822n;

    public c1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f44822n = null;
    }

    @Override
    public k1 b() {
        return k1.h(null, this.f44819c.consumeStableInsets());
    }

    @Override
    public k1 c() {
        return k1.h(null, this.f44819c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.c i() {
        if (this.f44822n == null) {
            WindowInsets windowInsets = this.f44819c;
            this.f44822n = i0.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f44822n;
    }

    @Override
    public boolean n() {
        return this.f44819c.isConsumed();
    }

    @Override
    public void s(i0.c cVar) {
        this.f44822n = cVar;
    }
}
