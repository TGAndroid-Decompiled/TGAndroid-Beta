package r0;

import android.view.View;
import android.view.WindowInsets;

public class h1 extends g1 {

    public static final m1 f46593r = m1.h(null, WindowInsets.CONSUMED);

    public h1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
    }

    @Override
    public i0.c f(int i10) {
        return i0.c.c(this.f46579c.getInsets(k1.a(i10)));
    }

    @Override
    public i0.c g(int i10) {
        return i0.c.c(this.f46579c.getInsetsIgnoringVisibility(k1.a(i10)));
    }

    @Override
    public boolean p(int i10) {
        return this.f46579c.isVisible(k1.a(i10));
    }

    @Override
    public final void d(View view) {
    }
}
