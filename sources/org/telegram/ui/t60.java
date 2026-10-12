package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class t60 implements org.telegram.ui.Components.w20, org.telegram.ui.ActionBar.z1, r0.n {
    public final int f42108a;
    public final e70 f42109b;

    public t60(e70 e70Var, int i10) {
        this.f42108a = i10;
        this.f42109b = e70Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(k1Var, false).d;
        e70 e70Var = this.f42109b;
        e70Var.m0 = i10;
        ai.x7 x7Var = e70Var.F;
        if (x7Var != null) {
            x7Var.setPadding(0, 0, 0, i10);
        }
        e70Var.j0();
        e70Var.h0();
        return r0.k1.f46999b;
    }

    @Override
    public void a(int i10) {
        e70 e70Var = this.f42109b;
        e70Var.f36997b.a(Math.min(i10, e70Var.f37000c0));
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f42108a) {
            case 1:
                this.f42109b.o0();
                return;
            default:
                this.f42109b.finishFragment();
                return;
        }
    }
}
