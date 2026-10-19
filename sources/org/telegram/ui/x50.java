package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class x50 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f43034a;
    public final z50 f43035b;

    public x50(z50 z50Var, FrameLayout frameLayout) {
        this.f43035b = z50Var;
        this.f43034a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f43034a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        z50 z50Var = this.f43035b;
        if (z50Var.f43642z0 == null) {
            z50Var.f43642z0 = (tc) z50Var.y0(z50Var.Z);
        }
        z50Var.f43642z0.f41634f.setOnClickListener(new s50(this, 1));
    }
}
