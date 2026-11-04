package r0;

import android.view.WindowInsets;
public final class g1 extends f1 {
    public static final k1 f54008s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f54008s = k1.h(null, windowInsets);
    }

    public g1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
    }

    @Override
    public i0.b f(int i3) {
        return i0.b.c(this.f53993c.getInsets(j1.a(i3)));
    }

    @Override
    public i0.b g(int i3) {
        return i0.b.c(this.f53993c.getInsetsIgnoringVisibility(j1.a(i3)));
    }

    @Override
    public boolean p(int i3) {
        return this.f53993c.isVisible(j1.a(i3));
    }
}
