package org.telegram.ui;

import android.content.Context;
public final class z50 extends org.telegram.ui.Components.voip.l {
    public final a60 h;

    public z50(a60 a60Var, Context context) {
        super(context, false);
        this.h = a60Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g60 g60Var = this.h.M;
        if (g60Var.Q.getVisibility() == 0 && g60Var.P2) {
            g60.O(g60Var, this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g60.O(this.h.M, this, false);
    }
}
