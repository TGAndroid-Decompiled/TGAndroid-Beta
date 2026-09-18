package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class t60 implements org.telegram.ui.Components.c20, org.telegram.ui.ActionBar.a2, r0.n {
    public final int f37582a;
    public final e70 f37583b;

    public t60(e70 e70Var, int i10) {
        this.f37582a = i10;
        this.f37583b = e70Var;
    }

    @Override
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(m1Var, false).d;
        e70 e70Var = this.f37583b;
        e70Var.m0 = i10;
        ai.v7 v7Var = e70Var.F;
        if (v7Var != null) {
            v7Var.setPadding(0, 0, 0, i10);
        }
        e70Var.j0();
        e70Var.h0();
        return r0.m1.f42108b;
    }

    @Override
    public void a(int i10) {
        e70 e70Var = this.f37583b;
        e70Var.f33192b.a(Math.min(i10, e70Var.f33195c0));
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37582a) {
            case 1:
                this.f37583b.o0();
                return;
            default:
                this.f37583b.finishFragment();
                return;
        }
    }
}
