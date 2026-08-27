package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

public final class z50 implements ViewTreeObserver.OnGlobalLayoutListener {

    public final FrameLayout f45030a;

    public final c60 f45031b;

    public z50(c60 c60Var, FrameLayout frameLayout) {
        this.f45031b = c60Var;
        this.f45030a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f45030a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        c60 c60Var = this.f45031b;
        if (c60Var.f36972v0 == null) {
            c60Var.f36972v0 = (qc) c60Var.y0(c60Var.V);
        }
        c60Var.f36972v0.f41632f.setOnClickListener(new u50(this, 1));
    }
}
