package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class x50 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f43039a;
    public final z50 f43040b;

    public x50(z50 z50Var, FrameLayout frameLayout) {
        this.f43040b = z50Var;
        this.f43039a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f43039a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        z50 z50Var = this.f43040b;
        if (z50Var.f43643z0 == null) {
            z50Var.f43643z0 = (tc) z50Var.y0(z50Var.Z);
        }
        z50Var.f43643z0.f41639f.setOnClickListener(new s50(this, 1));
    }
}
