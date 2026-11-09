package r0;

import android.view.View;
import android.view.WindowInsets;
public class f1 extends e1 {
    public static final k1 f54194r = k1.h(null, p4.r0.b());

    public f1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
    }

    @Override
    public i0.b f(int i7) {
        return i0.b.c(this.f54181c.getInsets(i1.a(i7)));
    }

    @Override
    public i0.b g(int i7) {
        return i0.b.c(this.f54181c.getInsetsIgnoringVisibility(i1.a(i7)));
    }

    @Override
    public boolean p(int i7) {
        return this.f54181c.isVisible(i1.a(i7));
    }

    @Override
    public final void d(View view) {
    }
}
