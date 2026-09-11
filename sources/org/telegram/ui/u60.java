package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u60 implements org.telegram.ui.Components.c20, org.telegram.ui.ActionBar.a2, r0.n {
    public final int f40947a;
    public final f70 f40948b;

    public u60(f70 f70Var, int i10) {
        this.f40947a = i10;
        this.f40948b = f70Var;
    }

    @Override
    public r0.l1 T0(View view, r0.l1 l1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(l1Var, false).d;
        f70 f70Var = this.f40948b;
        f70Var.m0 = i10;
        bi.e7 e7Var = f70Var.F;
        if (e7Var != null) {
            e7Var.setPadding(0, 0, 0, i10);
        }
        f70Var.j0();
        f70Var.h0();
        return r0.l1.f44710b;
    }

    @Override
    public void a(int i10) {
        f70 f70Var = this.f40948b;
        f70Var.f36280b.a(Math.min(i10, f70Var.f36283c0));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40947a) {
            case 1:
                this.f40948b.o0();
                return;
            default:
                this.f40948b.finishFragment();
                return;
        }
    }
}
