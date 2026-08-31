package org.telegram.ui;

import android.content.Context;
public final class w50 extends org.telegram.ui.Components.voip.l {
    public final x50 h;

    public w50(x50 x50Var, Context context) {
        super(context, false);
        this.h = x50Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d60 d60Var = this.h.J;
        if (d60Var.N.getVisibility() == 0 && d60Var.M2) {
            d60.N(d60Var, this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d60.N(this.h.J, this, false);
    }
}
