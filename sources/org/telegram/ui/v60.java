package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v60 implements org.telegram.ui.Components.c20, org.telegram.ui.ActionBar.b2, r0.n {
    public final int f38304a;
    public final g70 f38305b;

    public v60(g70 g70Var, int i10) {
        this.f38304a = i10;
        this.f38305b = g70Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(l1Var, false).d;
        g70 g70Var = this.f38305b;
        g70Var.m0 = i10;
        ai.v7 v7Var = g70Var.F;
        if (v7Var != null) {
            v7Var.setPadding(0, 0, 0, i10);
        }
        g70Var.j0();
        g70Var.h0();
        return r0.l1.f41876b;
    }

    @Override
    public void a(int i10) {
        g70 g70Var = this.f38305b;
        g70Var.f33869b.a(Math.min(i10, g70Var.f33872c0));
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f38304a) {
            case 1:
                this.f38305b.o0();
                return;
            default:
                this.f38305b.finishFragment();
                return;
        }
    }
}
