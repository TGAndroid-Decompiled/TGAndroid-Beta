package r0;

import android.view.View;
import android.view.WindowInsets;
public class g1 extends e1 {
    public static final l1 f56238r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f56238r = l1.h(null, windowInsets);
    }

    public g1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
    }

    @Override
    public i0.b f(int i7) {
        return i0.b.c(this.f56223c.getInsets(j1.a(i7)));
    }

    @Override
    public i0.b g(int i7) {
        return i0.b.c(this.f56223c.getInsetsIgnoringVisibility(j1.a(i7)));
    }

    @Override
    public boolean p(int i7) {
        return this.f56223c.isVisible(j1.a(i7));
    }

    @Override
    public final void d(View view) {
    }
}
