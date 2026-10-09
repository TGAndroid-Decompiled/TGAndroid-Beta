package r0;

import android.view.WindowInsets;
public final class g1 extends f1 {
    public static final k1 f46751s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f46751s = k1.h(null, windowInsets);
    }

    public g1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
    }

    @Override
    public i0.b f(int i10) {
        return i0.b.c(this.f46736c.getInsets(j1.a(i10)));
    }

    @Override
    public i0.b g(int i10) {
        return i0.b.c(this.f46736c.getInsetsIgnoringVisibility(j1.a(i10)));
    }

    @Override
    public boolean p(int i10) {
        return this.f46736c.isVisible(j1.a(i10));
    }
}
