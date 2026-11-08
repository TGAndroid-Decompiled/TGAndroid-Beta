package r0;

import android.view.WindowInsets;
public final class g1 extends f1 {
    public static final k1 f54183s = k1.h(null, p4.r0.b());

    public g1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
    }

    @Override
    public i0.b f(int i7) {
        return i0.b.c(this.f54168c.getInsets(j1.a(i7)));
    }

    @Override
    public i0.b g(int i7) {
        return i0.b.c(this.f54168c.getInsetsIgnoringVisibility(j1.a(i7)));
    }

    @Override
    public boolean p(int i7) {
        return this.f54168c.isVisible(j1.a(i7));
    }
}
