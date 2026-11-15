package r0;

import android.view.View;
import android.view.WindowInsets;
public class f1 extends e1 {
    public static final k1 f55662r = k1.h(null, p4.q0.c());

    public f1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
    }

    @Override
    public i0.c f(int i7) {
        return i0.c.c(this.f55649c.getInsets(i1.a(i7)));
    }

    @Override
    public i0.c g(int i7) {
        return i0.c.c(this.f55649c.getInsetsIgnoringVisibility(i1.a(i7)));
    }

    @Override
    public boolean p(int i7) {
        return this.f55649c.isVisible(i1.a(i7));
    }

    @Override
    public final void d(View view) {
    }
}
