package r0;

import android.view.WindowInsets;
public final class i1 extends h1 {
    public static final m1 f46913s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f46913s = m1.h(null, windowInsets);
    }

    public i1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
    }

    @Override
    public i0.b f(int i9) {
        return i0.b.c(this.f46889c.getInsets(l1.a(i9)));
    }

    @Override
    public i0.b g(int i9) {
        return i0.b.c(this.f46889c.getInsetsIgnoringVisibility(l1.a(i9)));
    }

    @Override
    public boolean p(int i9) {
        return this.f46889c.isVisible(l1.a(i9));
    }
}
