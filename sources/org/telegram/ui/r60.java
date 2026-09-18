package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class r60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f37096a;
    public final u60 f37097b;

    public r60(u60 u60Var, FrameLayout frameLayout) {
        this.f37097b = u60Var;
        this.f37096a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f37096a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        u60 u60Var = this.f37097b;
        if (u60Var.f37950z0 == null) {
            u60Var.f37950z0 = (vc) u60Var.y0(u60Var.Z);
        }
        u60Var.f37950z0.f38390f.setOnClickListener(new m60(this, 1));
    }
}
