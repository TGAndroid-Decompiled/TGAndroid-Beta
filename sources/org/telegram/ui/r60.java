package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class r60 implements org.telegram.ui.Components.t20, org.telegram.ui.ActionBar.a2, r0.n {
    public final int f41282a;
    public final c70 f41283b;

    public r60(c70 c70Var, int i10) {
        this.f41282a = i10;
        this.f41283b = c70Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(k1Var, false).d;
        c70 c70Var = this.f41283b;
        c70Var.m0 = i10;
        ai.x7 x7Var = c70Var.F;
        if (x7Var != null) {
            x7Var.setPadding(0, 0, 0, i10);
        }
        c70Var.j0();
        c70Var.h0();
        return r0.k1.f46774b;
    }

    @Override
    public void a(int i10) {
        c70 c70Var = this.f41283b;
        c70Var.f36542b.a(Math.min(i10, c70Var.f36545c0));
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f41282a) {
            case 1:
                this.f41283b.o0();
                return;
            default:
                this.f41283b.finishFragment();
                return;
        }
    }
}
