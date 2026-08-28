package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class v50 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f43387a;
    public final y50 f43388b;

    public v50(y50 y50Var, FrameLayout frameLayout) {
        this.f43388b = y50Var;
        this.f43387a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f43387a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        y50 y50Var = this.f43388b;
        if (y50Var.f44727v0 == null) {
            y50Var.f44727v0 = (pc) y50Var.x0(y50Var.V);
        }
        y50Var.f44727v0.f41440f.setOnClickListener(new q50(this, 1));
    }
}
