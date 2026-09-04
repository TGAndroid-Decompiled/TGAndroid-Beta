package r0;

import android.view.View;
import android.view.WindowInsets;
public class g1 extends f1 {
    public static final l1 f44685r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f44685r = l1.h(null, windowInsets);
    }

    public g1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
    }

    @Override
    public i0.c f(int i10) {
        return i0.c.c(this.f44671c.getInsets(j1.a(i10)));
    }

    @Override
    public i0.c g(int i10) {
        return i0.c.c(this.f44671c.getInsetsIgnoringVisibility(j1.a(i10)));
    }

    @Override
    public boolean p(int i10) {
        return this.f44671c.isVisible(j1.a(i10));
    }

    @Override
    public final void d(View view) {
    }
}
