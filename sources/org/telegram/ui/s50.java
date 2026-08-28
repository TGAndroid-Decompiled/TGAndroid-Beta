package org.telegram.ui;

import android.content.Context;
public final class s50 extends org.telegram.ui.Components.voip.l {
    public final u50 h;

    public s50(u50 u50Var, Context context) {
        super(context, true);
        this.h = u50Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u50 u50Var = this.h;
        if (u50Var.f43141r && getParticipant() != null) {
            u50Var.E(this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
