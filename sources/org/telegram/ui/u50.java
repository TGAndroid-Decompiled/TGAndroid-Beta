package org.telegram.ui;

import android.content.Context;
public final class u50 extends org.telegram.ui.Components.voip.l {
    public final w50 h;

    public u50(w50 w50Var, Context context) {
        super(context, true);
        this.h = w50Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w50 w50Var = this.h;
        if (w50Var.f42469r && getParticipant() != null) {
            w50Var.E(this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
