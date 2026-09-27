package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class r60 implements org.telegram.ui.Components.f20, org.telegram.ui.ActionBar.b2, r0.n {
    public final int f37004a;
    public final c70 f37005b;

    public r60(c70 c70Var, int i10) {
        this.f37004a = i10;
        this.f37005b = c70Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(l1Var, false).d;
        c70 c70Var = this.f37005b;
        c70Var.m0 = i10;
        ai.w7 w7Var = c70Var.F;
        if (w7Var != null) {
            w7Var.setPadding(0, 0, 0, i10);
        }
        c70Var.j0();
        c70Var.h0();
        return r0.l1.f42184b;
    }

    @Override
    public void a(int i10) {
        c70 c70Var = this.f37005b;
        c70Var.f32537b.a(Math.min(i10, c70Var.f32540c0));
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f37004a) {
            case 1:
                this.f37005b.o0();
                return;
            default:
                this.f37005b.finishFragment();
                return;
        }
    }
}
