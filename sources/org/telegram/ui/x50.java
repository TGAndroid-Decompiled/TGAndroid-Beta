package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class x50 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f43033a;
    public final z50 f43034b;

    public x50(z50 z50Var, FrameLayout frameLayout) {
        this.f43034b = z50Var;
        this.f43033a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f43033a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        z50 z50Var = this.f43034b;
        if (z50Var.f43637z0 == null) {
            z50Var.f43637z0 = (tc) z50Var.y0(z50Var.Z);
        }
        z50Var.f43637z0.f41633f.setOnClickListener(new s50(this, 1));
    }
}
