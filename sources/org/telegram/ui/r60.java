package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class r60 implements org.telegram.ui.Components.u20, org.telegram.ui.ActionBar.z1, r0.n {
    public final int f41372a;
    public final c70 f41373b;

    public r60(c70 c70Var, int i10) {
        this.f41372a = i10;
        this.f41373b = c70Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(k1Var, false).d;
        c70 c70Var = this.f41373b;
        c70Var.m0 = i10;
        ai.x7 x7Var = c70Var.F;
        if (x7Var != null) {
            x7Var.setPadding(0, 0, 0, i10);
        }
        c70Var.j0();
        c70Var.h0();
        return r0.k1.f46900b;
    }

    @Override
    public void a(int i10) {
        c70 c70Var = this.f41373b;
        c70Var.f36620b.a(Math.min(i10, c70Var.f36623c0));
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f41372a) {
            case 1:
                this.f41373b.o0();
                return;
            default:
                this.f41373b.finishFragment();
                return;
        }
    }
}
