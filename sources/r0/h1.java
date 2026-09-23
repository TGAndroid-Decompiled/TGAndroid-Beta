package r0;

import android.view.WindowInsets;
public final class h1 extends g1 {
    public static final l1 f41793s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f41793s = l1.h(null, windowInsets);
    }

    public h1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
    }

    @Override
    public i0.b f(int i10) {
        return i0.b.c(this.f41772c.getInsets(k1.a(i10)));
    }

    @Override
    public i0.b g(int i10) {
        return i0.b.c(this.f41772c.getInsetsIgnoringVisibility(k1.a(i10)));
    }

    @Override
    public boolean p(int i10) {
        return this.f41772c.isVisible(k1.a(i10));
    }
}
