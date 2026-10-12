package org.telegram.ui;

import android.content.Context;
public final class vj0 extends di.d {
    public final xj0 f41019h0;

    public vj0(xj0 xj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, true);
        this.f41019h0 = xj0Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        xj0 xj0Var = this.f41019h0;
        if (xj0Var.f41882n0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        xj0Var.f41882n0 = f7;
        if (z10) {
            xj0Var.f41883o0 = new org.telegram.ui.Components.sb0(xj0Var, 1);
            xj0Var.T(false);
        }
        return f7;
    }
}
