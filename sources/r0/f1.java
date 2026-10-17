package r0;

import android.view.View;
import android.view.WindowInsets;
public class f1 extends e1 {
    public static final k1 f44830r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f44830r = k1.h(null, windowInsets);
    }

    public f1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
    }

    @Override
    public i0.c f(int i10) {
        return i0.c.c(this.f44819c.getInsets(i1.a(i10)));
    }

    @Override
    public i0.c g(int i10) {
        return i0.c.c(this.f44819c.getInsetsIgnoringVisibility(i1.a(i10)));
    }

    @Override
    public boolean p(int i10) {
        return this.f44819c.isVisible(i1.a(i10));
    }

    @Override
    public final void d(View view) {
    }
}
