package r0;

import android.view.WindowInsets;
public final class f1 extends e1 {
    public static final j1 f46126s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f46126s = j1.h(null, windowInsets);
    }

    public f1(j1 j1Var, WindowInsets windowInsets) {
        super(j1Var, windowInsets);
    }

    @Override
    public i0.c f(int i10) {
        return i0.c.c(this.f46111c.getInsets(i1.a(i10)));
    }

    @Override
    public i0.c g(int i10) {
        return i0.c.c(this.f46111c.getInsetsIgnoringVisibility(i1.a(i10)));
    }

    @Override
    public boolean p(int i10) {
        return this.f46111c.isVisible(i1.a(i10));
    }
}
