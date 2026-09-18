package r0;

import android.view.View;
import android.view.WindowInsets;
public class h1 extends g1 {
    public static final m1 f42094r = m1.h(null, s0.a());

    public h1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
    }

    @Override
    public i0.b f(int i10) {
        return i0.b.c(this.f42074c.getInsets(k1.a(i10)));
    }

    @Override
    public i0.b g(int i10) {
        return i0.b.c(this.f42074c.getInsetsIgnoringVisibility(k1.a(i10)));
    }

    @Override
    public boolean p(int i10) {
        return this.f42074c.isVisible(k1.a(i10));
    }

    @Override
    public final void d(View view) {
    }
}
