package org.telegram.ui;

import android.content.Context;
public final class y50 extends org.telegram.ui.Components.voip.l {
    public final a60 h;

    public y50(a60 a60Var, Context context) {
        super(context, true);
        this.h = a60Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a60 a60Var = this.h;
        if (a60Var.f35600r && getParticipant() != null) {
            a60Var.E(this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
