package org.telegram.ui;

import android.content.Context;
public final class x50 extends org.telegram.ui.Components.voip.l {
    public final y50 h;

    public x50(y50 y50Var, Context context) {
        super(context, false);
        this.h = y50Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e60 e60Var = this.h.J;
        if (e60Var.N.getVisibility() == 0 && e60Var.M2) {
            e60.N(e60Var, this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e60.N(this.h.J, this, false);
    }
}
