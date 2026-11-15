package r0;

import android.view.WindowInsets;
public final class g1 extends f1 {
    public static final k1 f55664s = k1.h(null, p4.q0.c());

    public g1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
    }

    @Override
    public i0.c f(int i7) {
        return i0.c.c(this.f55649c.getInsets(j1.a(i7)));
    }

    @Override
    public i0.c g(int i7) {
        return i0.c.c(this.f55649c.getInsetsIgnoringVisibility(j1.a(i7)));
    }

    @Override
    public boolean p(int i7) {
        return this.f55649c.isVisible(j1.a(i7));
    }
}
