package org.telegram.ui;

import android.content.Context;
public final class rj0 extends di.d {
    public final tj0 f40211h0;

    public rj0(tj0 tj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, true);
        this.f40211h0 = tj0Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        tj0 tj0Var = this.f40211h0;
        if (tj0Var.f40807n0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        tj0Var.f40807n0 = f7;
        if (z10) {
            tj0Var.f40808o0 = new org.telegram.ui.Components.sa0(tj0Var, 1);
            tj0Var.S(false);
        }
        return f7;
    }
}
