package org.telegram.ui;

import android.content.Context;
public final class v50 extends org.telegram.ui.Components.voip.l {
    public final w50 h;

    public v50(w50 w50Var, Context context) {
        super(context, false);
        this.h = w50Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c60 c60Var = this.h.J;
        if (c60Var.N.getVisibility() == 0 && c60Var.M2) {
            c60.N(c60Var, this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c60.N(this.h.J, this, false);
    }
}
