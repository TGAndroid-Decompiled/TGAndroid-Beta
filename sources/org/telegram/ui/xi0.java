package org.telegram.ui;

import android.content.Context;
public final class xi0 extends nh.d {
    public final zi0 f44598d0;

    public xi0(zi0 zi0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, true);
        this.f44598d0 = zi0Var;
    }

    @Override
    public final float a(float f9, float f10) {
        boolean z10;
        zi0 zi0Var = this.f44598d0;
        if (zi0Var.f45246j0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        zi0Var.f45246j0 = f9;
        if (z10) {
            zi0Var.f45247k0 = new eg.p2(zi0Var, 2);
            zi0Var.S(false);
        }
        return f9;
    }
}
