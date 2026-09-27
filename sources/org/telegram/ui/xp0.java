package org.telegram.ui;

import android.view.KeyEvent;
public final class xp0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.m1 {
    public final int f40024a;
    public final fq0 f40025b;

    public xp0(fq0 fq0Var, int i10) {
        this.f40024a = i10;
        this.f40025b = fq0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f40024a) {
            case 0:
                fq0 fq0Var = this.f40025b;
                fq0Var.V(fq0Var.f33608b, fq0Var.f33609c, z10, i10);
                fq0Var.finishFragment();
                return;
            default:
                fq0 fq0Var2 = this.f40025b;
                fq0Var2.V(fq0Var2.f33608b, fq0Var2.f33609c, z10, i10);
                fq0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        fq0 fq0Var = this.f40025b;
        fq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = fq0Var.I) != null && o1Var.isShowing()) {
            fq0Var.I.d(true);
        }
    }
}
