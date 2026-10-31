package org.telegram.ui;

import android.view.KeyEvent;
public final class un0 implements org.telegram.ui.Components.q4, org.telegram.ui.ActionBar.i1 {
    public final int f42504a;
    public final yn0 f42505b;

    public un0(yn0 yn0Var, int i10) {
        this.f42504a = i10;
        this.f42505b = yn0Var;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        switch (this.f42504a) {
            case 0:
                yn0 yn0Var = this.f42505b;
                yn0Var.Z(yn0Var.f43865b, yn0Var.f43866c, z10, i10);
                yn0Var.finishFragment();
                return;
            default:
                yn0 yn0Var2 = this.f42505b;
                yn0Var2.Z(yn0Var2.f43865b, yn0Var2.f43866c, z10, i10);
                yn0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void r(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        yn0 yn0Var = this.f42505b;
        yn0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var = yn0Var.I) != null && k1Var.isShowing()) {
            yn0Var.I.d(true);
        }
    }
}
