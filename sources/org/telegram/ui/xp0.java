package org.telegram.ui;

import android.view.KeyEvent;
public final class xp0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.l1 {
    public final int f42921a;
    public final fq0 f42922b;

    public xp0(fq0 fq0Var, int i10) {
        this.f42921a = i10;
        this.f42922b = fq0Var;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        switch (this.f42921a) {
            case 0:
                fq0 fq0Var = this.f42922b;
                fq0Var.T(fq0Var.f36362b, fq0Var.f36363c, z10, i10);
                fq0Var.finishFragment();
                return;
            default:
                fq0 fq0Var2 = this.f42922b;
                fq0Var2.T(fq0Var2.f36362b, fq0Var2.f36363c, z10, i10);
                fq0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        fq0 fq0Var = this.f42922b;
        fq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = fq0Var.I) != null && n1Var.isShowing()) {
            fq0Var.I.d(true);
        }
    }
}
