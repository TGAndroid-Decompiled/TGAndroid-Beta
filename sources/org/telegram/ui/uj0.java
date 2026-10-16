package org.telegram.ui;

import android.content.Context;
public final class uj0 extends di.d {
    public final wj0 f40418h0;

    public uj0(wj0 wj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, true);
        this.f40418h0 = wj0Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        wj0 wj0Var = this.f40418h0;
        if (wj0Var.f41312n0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        wj0Var.f41312n0 = f7;
        if (z10) {
            wj0Var.f41313o0 = new org.telegram.ui.Components.sb0(wj0Var, 1);
            wj0Var.T(false);
        }
        return f7;
    }
}
