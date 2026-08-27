package r0;

import android.view.WindowInsets;

public class e1 extends d1 {

    public i0.c f46583n;

    public e1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
        this.f46583n = null;
    }

    @Override
    public m1 b() {
        return m1.h(null, this.f46579c.consumeStableInsets());
    }

    @Override
    public m1 c() {
        return m1.h(null, this.f46579c.consumeSystemWindowInsets());
    }

    @Override
    public final i0.c i() {
        if (this.f46583n == null) {
            WindowInsets windowInsets = this.f46579c;
            this.f46583n = i0.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f46583n;
    }

    @Override
    public boolean n() {
        return this.f46579c.isConsumed();
    }

    @Override
    public void s(i0.c cVar) {
        this.f46583n = cVar;
    }
}
