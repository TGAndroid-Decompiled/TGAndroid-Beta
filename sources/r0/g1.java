package r0;

import android.view.View;
import android.view.WindowInsets;
public class g1 extends f1 {
    public static final l1 f41784r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f41784r = l1.h(null, windowInsets);
    }

    public g1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
    }

    @Override
    public i0.b f(int i10) {
        return i0.b.c(this.f41772c.getInsets(j1.a(i10)));
    }

    @Override
    public i0.b g(int i10) {
        return i0.b.c(this.f41772c.getInsetsIgnoringVisibility(j1.a(i10)));
    }

    @Override
    public boolean p(int i10) {
        return this.f41772c.isVisible(j1.a(i10));
    }

    @Override
    public final void d(View view) {
    }
}
