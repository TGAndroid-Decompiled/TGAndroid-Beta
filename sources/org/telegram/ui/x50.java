package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class x50 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f43043a;
    public final z50 f43044b;

    public x50(z50 z50Var, FrameLayout frameLayout) {
        this.f43044b = z50Var;
        this.f43043a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f43043a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        z50 z50Var = this.f43044b;
        if (z50Var.f43647z0 == null) {
            z50Var.f43647z0 = (tc) z50Var.y0(z50Var.Z);
        }
        z50Var.f43647z0.f41643f.setOnClickListener(new s50(this, 1));
    }
}
