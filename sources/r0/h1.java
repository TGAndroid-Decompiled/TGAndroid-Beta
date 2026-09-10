package r0;

import android.view.WindowInsets;
public final class h1 extends g1 {
    public static final l1 f41060s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f41060s = l1.h(null, windowInsets);
    }

    public h1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
    }

    @Override
    public i0.c f(int i10) {
        return i0.c.c(this.f41039c.getInsets(k1.a(i10)));
    }

    @Override
    public i0.c g(int i10) {
        return i0.c.c(this.f41039c.getInsetsIgnoringVisibility(k1.a(i10)));
    }

    @Override
    public boolean p(int i10) {
        return this.f41039c.isVisible(k1.a(i10));
    }
}
