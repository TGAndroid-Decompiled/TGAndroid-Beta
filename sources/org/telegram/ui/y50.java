package org.telegram.ui;

import android.content.Context;
public final class y50 extends org.telegram.ui.Components.voip.l {
    public final z50 h;

    public y50(z50 z50Var, Context context) {
        super(context, false);
        this.h = z50Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f60 f60Var = this.h.M;
        if (f60Var.Q.getVisibility() == 0 && f60Var.P2) {
            f60.N(f60Var, this, true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f60.N(this.h.M, this, false);
    }
}
