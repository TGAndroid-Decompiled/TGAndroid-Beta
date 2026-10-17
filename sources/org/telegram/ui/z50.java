package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class z50 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f43574a;
    public final b60 f43575b;

    public z50(b60 b60Var, FrameLayout frameLayout) {
        this.f43575b = b60Var;
        this.f43574a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f43574a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        b60 b60Var = this.f43575b;
        if (b60Var.f35573z0 == null) {
            b60Var.f35573z0 = (vc) b60Var.y0(b60Var.Z);
        }
        b60Var.f35573z0.f42172f.setOnClickListener(new y50(this, 0));
    }
}
