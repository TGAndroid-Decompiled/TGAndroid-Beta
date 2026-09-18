package org.telegram.ui;

import android.content.Context;
public final class rj0 extends ci.d {
    public final tj0 f37255h0;

    public rj0(tj0 tj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, true);
        this.f37255h0 = tj0Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        tj0 tj0Var = this.f37255h0;
        if (tj0Var.f37823n0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        tj0Var.f37823n0 = f7;
        if (z10) {
            tj0Var.f37824o0 = new org.telegram.ui.Components.ra0(tj0Var, 1);
            tj0Var.S(false);
        }
        return f7;
    }
}
