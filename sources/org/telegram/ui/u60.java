package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class u60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f40274a;
    public final x60 f40275b;

    public u60(x60 x60Var, FrameLayout frameLayout) {
        this.f40275b = x60Var;
        this.f40274a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f40274a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        x60 x60Var = this.f40275b;
        if (x60Var.f41446z0 == null) {
            x60Var.f41446z0 = (zc) x60Var.y0(x60Var.Z);
        }
        x60Var.f41446z0.f42276f.setOnClickListener(new t60(this, 0));
    }
}
