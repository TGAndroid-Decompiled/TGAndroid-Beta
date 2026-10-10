package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class r60 implements org.telegram.ui.Components.u20, org.telegram.ui.ActionBar.a2, r0.n {
    public final int f41328a;
    public final c70 f41329b;

    public r60(c70 c70Var, int i10) {
        this.f41328a = i10;
        this.f41329b = c70Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(k1Var, false).d;
        c70 c70Var = this.f41329b;
        c70Var.m0 = i10;
        ai.x7 x7Var = c70Var.F;
        if (x7Var != null) {
            x7Var.setPadding(0, 0, 0, i10);
        }
        c70Var.j0();
        c70Var.h0();
        return r0.k1.f46820b;
    }

    @Override
    public void a(int i10) {
        c70 c70Var = this.f41329b;
        c70Var.f36588b.a(Math.min(i10, c70Var.f36591c0));
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f41328a) {
            case 1:
                this.f41329b.o0();
                return;
            default:
                this.f41329b.finishFragment();
                return;
        }
    }
}
