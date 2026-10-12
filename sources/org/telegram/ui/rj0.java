package org.telegram.ui;

import android.content.Context;
public final class rj0 extends ci.d {
    public final tj0 f41668h0;

    public rj0(tj0 tj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, true);
        this.f41668h0 = tj0Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        tj0 tj0Var = this.f41668h0;
        if (tj0Var.f42228n0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        tj0Var.f42228n0 = f7;
        if (z10) {
            tj0Var.f42229o0 = new org.telegram.ui.Components.xb0(tj0Var, 1);
            tj0Var.T(false);
        }
        return f7;
    }
}
