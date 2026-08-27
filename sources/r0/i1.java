package r0;

import android.view.WindowInsets;

public final class i1 extends h1 {

    public static final m1 f46603s = m1.h(null, WindowInsets.CONSUMED);

    public i1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
    }

    @Override
    public i0.c f(int i10) {
        return i0.c.c(this.f46579c.getInsets(l1.a(i10)));
    }

    @Override
    public i0.c g(int i10) {
        return i0.c.c(this.f46579c.getInsetsIgnoringVisibility(l1.a(i10)));
    }

    @Override
    public boolean p(int i10) {
        return this.f46579c.isVisible(l1.a(i10));
    }
}
