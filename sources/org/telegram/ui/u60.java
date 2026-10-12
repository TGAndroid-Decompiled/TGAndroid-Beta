package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class u60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f40548a;
    public final x60 f40549b;

    public u60(x60 x60Var, FrameLayout frameLayout) {
        this.f40549b = x60Var;
        this.f40548a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f40548a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        x60 x60Var = this.f40549b;
        if (x60Var.f41762z0 == null) {
            x60Var.f41762z0 = (ad) x60Var.y0(x60Var.Z);
        }
        x60Var.f41762z0.f34184f.setOnClickListener(new t60(this, 0));
    }
}
