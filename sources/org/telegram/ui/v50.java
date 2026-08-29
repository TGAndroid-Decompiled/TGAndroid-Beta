package org.telegram.ui;

import android.content.Context;
public final class v50 extends org.telegram.ui.Components.voip.l {
    public final x50 h;

    public v50(x50 x50Var, Context context) {
        super(context, true);
        this.h = x50Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x50 x50Var = this.h;
        if (x50Var.f44473r && getParticipant() != null) {
            x50Var.E(this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
