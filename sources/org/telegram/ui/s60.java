package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s60 implements org.telegram.ui.Components.g20, org.telegram.ui.ActionBar.a2, r0.n {
    public final int f40369a;
    public final d70 f40370b;

    public s60(d70 d70Var, int i10) {
        this.f40369a = i10;
        this.f40370b = d70Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(l1Var, false).d;
        d70 d70Var = this.f40370b;
        d70Var.m0 = i10;
        ai.w7 w7Var = d70Var.F;
        if (w7Var != null) {
            w7Var.setPadding(0, 0, 0, i10);
        }
        d70Var.j0();
        d70Var.h0();
        return r0.l1.f45608b;
    }

    @Override
    public void a(int i10) {
        d70 d70Var = this.f40370b;
        d70Var.f35661b.a(Math.min(i10, d70Var.f35664c0));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40369a) {
            case 1:
                this.f40370b.o0();
                return;
            default:
                this.f40370b.finishFragment();
                return;
        }
    }
}
