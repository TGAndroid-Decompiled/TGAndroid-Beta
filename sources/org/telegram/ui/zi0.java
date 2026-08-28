package org.telegram.ui;

import android.content.Context;
public final class zi0 extends kh.d {
    public final bj0 f45165d0;

    public zi0(bj0 bj0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, true);
        this.f45165d0 = bj0Var;
    }

    @Override
    public final float a(float f10, float f11) {
        boolean z10;
        bj0 bj0Var = this.f45165d0;
        if (bj0Var.f36888j0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        bj0Var.f36888j0 = f10;
        if (z10) {
            bj0Var.f36889k0 = new bg.z2(bj0Var, 2);
            bj0Var.R(false);
        }
        return f10;
    }
}
