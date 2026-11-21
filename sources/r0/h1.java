package r0;

import android.view.WindowInsets;
public final class h1 extends g1 {
    public static final l1 f56284s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f56284s = l1.h(null, windowInsets);
    }

    public h1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
    }

    @Override
    public i0.b f(int i7) {
        return i0.b.c(this.f56264c.getInsets(k1.a(i7)));
    }

    @Override
    public i0.b g(int i7) {
        return i0.b.c(this.f56264c.getInsetsIgnoringVisibility(k1.a(i7)));
    }

    @Override
    public boolean p(int i7) {
        return this.f56264c.isVisible(k1.a(i7));
    }
}
