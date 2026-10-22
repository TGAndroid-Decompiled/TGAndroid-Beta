package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class x50 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f43042a;
    public final z50 f43043b;

    public x50(z50 z50Var, FrameLayout frameLayout) {
        this.f43043b = z50Var;
        this.f43042a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f43042a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        z50 z50Var = this.f43043b;
        if (z50Var.f43646z0 == null) {
            z50Var.f43646z0 = (tc) z50Var.y0(z50Var.Z);
        }
        z50Var.f43646z0.f41642f.setOnClickListener(new s50(this, 1));
    }
}
