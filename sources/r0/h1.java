package r0;

import android.view.WindowInsets;
public final class h1 extends g1 {
    public static final l1 f56288s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f56288s = l1.h(null, windowInsets);
    }

    public h1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
    }

    @Override
    public i0.b f(int i7) {
        return i0.b.c(this.f56268c.getInsets(k1.a(i7)));
    }

    @Override
    public i0.b g(int i7) {
        return i0.b.c(this.f56268c.getInsetsIgnoringVisibility(k1.a(i7)));
    }

    @Override
    public boolean p(int i7) {
        return this.f56268c.isVisible(k1.a(i7));
    }
}
