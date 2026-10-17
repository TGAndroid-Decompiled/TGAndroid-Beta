package r0;

import android.view.WindowInsets;
public final class g1 extends f1 {
    public static final k1 f44832s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f44832s = k1.h(null, windowInsets);
    }

    public g1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
    }

    @Override
    public i0.c f(int i10) {
        return i0.c.c(this.f44819c.getInsets(j1.a(i10)));
    }

    @Override
    public i0.c g(int i10) {
        return i0.c.c(this.f44819c.getInsetsIgnoringVisibility(j1.a(i10)));
    }

    @Override
    public boolean p(int i10) {
        return this.f44819c.isVisible(j1.a(i10));
    }
}
