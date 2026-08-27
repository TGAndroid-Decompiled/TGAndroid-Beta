package org.telegram.ui;

import android.content.Context;

public final class w50 extends org.telegram.ui.Components.voip.l {
    public final y50 h;

    public w50(y50 y50Var, Context context) {
        super(context, true);
        this.h = y50Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        y50 y50Var = this.h;
        if (!y50Var.f44706r || getParticipant() == null) {
            return;
        }
        y50Var.E(this, true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
