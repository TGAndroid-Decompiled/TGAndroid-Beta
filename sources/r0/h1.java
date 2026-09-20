package r0;

import android.view.WindowInsets;
public final class h1 extends g1 {
    public static final l1 f42140s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f42140s = l1.h(null, windowInsets);
    }

    public h1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
    }

    @Override
    public i0.b f(int i10) {
        return i0.b.c(this.f42119c.getInsets(k1.a(i10)));
    }

    @Override
    public i0.b g(int i10) {
        return i0.b.c(this.f42119c.getInsetsIgnoringVisibility(k1.a(i10)));
    }

    @Override
    public boolean p(int i10) {
        return this.f42119c.isVisible(k1.a(i10));
    }
}
