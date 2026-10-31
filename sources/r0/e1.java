package r0;

import android.view.View;
import android.view.WindowInsets;
public class e1 extends d1 {
    public static final j1 f46114r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f46114r = j1.h(null, windowInsets);
    }

    public e1(j1 j1Var, WindowInsets windowInsets) {
        super(j1Var, windowInsets);
    }

    @Override
    public i0.c f(int i10) {
        return i0.c.c(this.f46100c.getInsets(h1.a(i10)));
    }

    @Override
    public i0.c g(int i10) {
        return i0.c.c(this.f46100c.getInsetsIgnoringVisibility(h1.a(i10)));
    }

    @Override
    public boolean p(int i10) {
        return this.f46100c.isVisible(h1.a(i10));
    }

    @Override
    public final void d(View view) {
    }
}
