package org.telegram.ui;

import android.content.Context;
public final class sj0 extends ci.d {
    public final uj0 f37440h0;

    public sj0(uj0 uj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, true);
        this.f37440h0 = uj0Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        uj0 uj0Var = this.f37440h0;
        if (uj0Var.f38144n0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        uj0Var.f38144n0 = f7;
        if (z10) {
            uj0Var.f38145o0 = new org.telegram.ui.Components.cb0(uj0Var, 1);
            uj0Var.S(false);
        }
        return f7;
    }
}
