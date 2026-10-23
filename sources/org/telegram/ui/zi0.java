package org.telegram.ui;

import android.content.Context;
public final class zi0 extends ei.d {
    public final bj0 f43770h0;

    public zi0(bj0 bj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, true);
        this.f43770h0 = bj0Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        bj0 bj0Var = this.f43770h0;
        if (bj0Var.f35663n0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        bj0Var.f35663n0 = f7;
        if (z10) {
            bj0Var.f35664o0 = new org.telegram.ui.Components.mb0(bj0Var, 1);
            bj0Var.T(false);
        }
        return f7;
    }
}
