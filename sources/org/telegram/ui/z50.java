package org.telegram.ui;

import android.content.Context;
public final class z50 extends org.telegram.ui.Components.voip.l {
    public final b60 h;

    public z50(b60 b60Var, Context context) {
        super(context, true);
        this.h = b60Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b60 b60Var = this.h;
        if (b60Var.f37985r && getParticipant() != null) {
            b60Var.E(this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
