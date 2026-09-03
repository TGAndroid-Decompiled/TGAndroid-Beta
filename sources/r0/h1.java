package r0;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.ui.cl0;
public class h1 extends g1 {
    public static final m1 f46457r = m1.h(null, cl0.d());

    public h1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
    }

    @Override
    public i0.b f(int i10) {
        return i0.b.c(this.f46443c.getInsets(k1.a(i10)));
    }

    @Override
    public i0.b g(int i10) {
        return i0.b.c(this.f46443c.getInsetsIgnoringVisibility(k1.a(i10)));
    }

    @Override
    public boolean p(int i10) {
        return this.f46443c.isVisible(k1.a(i10));
    }

    @Override
    public final void d(View view) {
    }
}
