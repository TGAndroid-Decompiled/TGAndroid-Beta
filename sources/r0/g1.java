package r0;

import android.view.WindowInsets;
import org.telegram.ui.li1;
public final class g1 extends f1 {
    public static final k1 f47131s = k1.h(null, li1.e());

    public g1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
    }

    @Override
    public i0.b f(int i10) {
        return i0.b.c(this.f47118c.getInsets(j1.a(i10)));
    }

    @Override
    public i0.b g(int i10) {
        return i0.b.c(this.f47118c.getInsetsIgnoringVisibility(j1.a(i10)));
    }

    @Override
    public boolean p(int i10) {
        return this.f47118c.isVisible(j1.a(i10));
    }
}
