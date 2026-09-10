package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class t60 implements org.telegram.ui.Components.l20, org.telegram.ui.ActionBar.c2, r0.n {
    public final int f36849a;
    public final e70 f36850b;

    public t60(e70 e70Var, int i10) {
        this.f36849a = i10;
        this.f36850b = e70Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(l1Var, false).d;
        e70 e70Var = this.f36850b;
        e70Var.m0 = i10;
        bi.w7 w7Var = e70Var.F;
        if (w7Var != null) {
            w7Var.setPadding(0, 0, 0, i10);
        }
        e70Var.j0();
        e70Var.h0();
        return r0.l1.f41073b;
    }

    @Override
    public void a(int i10) {
        e70 e70Var = this.f36850b;
        e70Var.f32079b.a(Math.min(i10, e70Var.f32082c0));
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f36849a) {
            case 1:
                this.f36850b.o0();
                return;
            default:
                this.f36850b.finishFragment();
                return;
        }
    }
}
