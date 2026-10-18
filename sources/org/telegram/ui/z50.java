package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class z50 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f43600a;
    public final b60 f43601b;

    public z50(b60 b60Var, FrameLayout frameLayout) {
        this.f43601b = b60Var;
        this.f43600a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f43600a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        b60 b60Var = this.f43601b;
        if (b60Var.f35596z0 == null) {
            b60Var.f35596z0 = (vc) b60Var.y0(b60Var.Z);
        }
        b60Var.f35596z0.f42189f.setOnClickListener(new y50(this, 0));
    }
}
