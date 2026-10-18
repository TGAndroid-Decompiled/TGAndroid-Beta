package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class z50 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f43564a;
    public final b60 f43565b;

    public z50(b60 b60Var, FrameLayout frameLayout) {
        this.f43565b = b60Var;
        this.f43564a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f43564a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        b60 b60Var = this.f43565b;
        if (b60Var.f35557z0 == null) {
            b60Var.f35557z0 = (vc) b60Var.y0(b60Var.Z);
        }
        b60Var.f35557z0.f42147f.setOnClickListener(new y50(this, 0));
    }
}
