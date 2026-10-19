package org.telegram.ui;

import android.content.Context;
public final class yi0 extends ei.d {
    public final aj0 f43503h0;

    public yi0(aj0 aj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, true);
        this.f43503h0 = aj0Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        aj0 aj0Var = this.f43503h0;
        if (aj0Var.f35383n0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        aj0Var.f35383n0 = f7;
        if (z10) {
            aj0Var.f35384o0 = new org.telegram.ui.Components.mb0(aj0Var, 1);
            aj0Var.T(false);
        }
        return f7;
    }
}
