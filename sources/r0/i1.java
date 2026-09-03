package r0;

import android.view.WindowInsets;
import org.telegram.ui.cl0;
public final class i1 extends h1 {
    public static final m1 f46467s = m1.h(null, cl0.d());

    public i1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
    }

    @Override
    public i0.b f(int i10) {
        return i0.b.c(this.f46443c.getInsets(l1.a(i10)));
    }

    @Override
    public i0.b g(int i10) {
        return i0.b.c(this.f46443c.getInsetsIgnoringVisibility(l1.a(i10)));
    }

    @Override
    public boolean p(int i10) {
        return this.f46443c.isVisible(l1.a(i10));
    }
}
