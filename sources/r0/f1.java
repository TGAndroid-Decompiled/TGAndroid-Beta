package r0;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.ui.li1;
public class f1 extends e1 {
    public static final k1 f47129r = k1.h(null, li1.e());

    public f1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
    }

    @Override
    public i0.b f(int i10) {
        return i0.b.c(this.f47118c.getInsets(i1.a(i10)));
    }

    @Override
    public i0.b g(int i10) {
        return i0.b.c(this.f47118c.getInsetsIgnoringVisibility(i1.a(i10)));
    }

    @Override
    public boolean p(int i10) {
        return this.f47118c.isVisible(i1.a(i10));
    }

    @Override
    public final void d(View view) {
    }
}
