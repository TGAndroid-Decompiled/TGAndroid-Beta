package r0;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.ui.al0;
public class h1 extends g1 {
    public static final m1 f43107r = m1.h(null, al0.d());

    public h1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
    }

    @Override
    public i0.b f(int i10) {
        return i0.b.c(this.f43095c.getInsets(k1.a(i10)));
    }

    @Override
    public i0.b g(int i10) {
        return i0.b.c(this.f43095c.getInsetsIgnoringVisibility(k1.a(i10)));
    }

    @Override
    public boolean p(int i10) {
        return this.f43095c.isVisible(k1.a(i10));
    }

    @Override
    public final void d(View view) {
    }
}
