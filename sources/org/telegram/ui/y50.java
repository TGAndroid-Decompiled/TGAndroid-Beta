package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class y50 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f44746a;
    public final a60 f44747b;

    public y50(a60 a60Var, FrameLayout frameLayout) {
        this.f44747b = a60Var;
        this.f44746a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f44746a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        a60 a60Var = this.f44747b;
        if (a60Var.f36440v0 == null) {
            a60Var.f36440v0 = (oc) a60Var.y0(a60Var.V);
        }
        a60Var.f36440v0.f41088f.setOnClickListener(new t50(this, 1));
    }
}
