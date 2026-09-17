package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class r60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f37091a;
    public final u60 f37092b;

    public r60(u60 u60Var, FrameLayout frameLayout) {
        this.f37092b = u60Var;
        this.f37091a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f37091a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        u60 u60Var = this.f37092b;
        if (u60Var.f37945z0 == null) {
            u60Var.f37945z0 = (vc) u60Var.y0(u60Var.Z);
        }
        u60Var.f37945z0.f38385f.setOnClickListener(new m60(this, 1));
    }
}
