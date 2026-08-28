package r0;

import android.view.View;
import android.view.WindowInsets;
public class h1 extends g1 {
    public static final m1 f46903r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f46903r = m1.h(null, windowInsets);
    }

    public h1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
    }

    @Override
    public i0.b f(int i9) {
        return i0.b.c(this.f46889c.getInsets(k1.a(i9)));
    }

    @Override
    public i0.b g(int i9) {
        return i0.b.c(this.f46889c.getInsetsIgnoringVisibility(k1.a(i9)));
    }

    @Override
    public boolean p(int i9) {
        return this.f46889c.isVisible(k1.a(i9));
    }

    @Override
    public final void d(View view) {
    }
}
