package r0;

import android.view.View;
import android.view.WindowInsets;
public class f1 extends e1 {
    public static final k1 f54006r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f54006r = k1.h(null, windowInsets);
    }

    public f1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
    }

    @Override
    public i0.b f(int i3) {
        return i0.b.c(this.f53993c.getInsets(i1.a(i3)));
    }

    @Override
    public i0.b g(int i3) {
        return i0.b.c(this.f53993c.getInsetsIgnoringVisibility(i1.a(i3)));
    }

    @Override
    public boolean p(int i3) {
        return this.f53993c.isVisible(i1.a(i3));
    }

    @Override
    public final void d(View view) {
    }
}
