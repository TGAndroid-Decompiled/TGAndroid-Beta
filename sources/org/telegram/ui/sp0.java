package org.telegram.ui;

import android.view.KeyEvent;
public final class sp0 implements org.telegram.ui.Components.e5, org.telegram.ui.ActionBar.m1 {
    public final int f43568a;
    public final aq0 f43569b;

    public sp0(aq0 aq0Var, int i10) {
        this.f43568a = i10;
        this.f43569b = aq0Var;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        switch (this.f43568a) {
            case 0:
                aq0 aq0Var = this.f43569b;
                aq0Var.W(aq0Var.f37873b, aq0Var.f37874c, z10, i10);
                aq0Var.finishFragment();
                return;
            default:
                aq0 aq0Var2 = this.f43569b;
                aq0Var2.W(aq0Var2.f37873b, aq0Var2.f37874c, z10, i10);
                aq0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        aq0 aq0Var = this.f43569b;
        aq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = aq0Var.I) != null && o1Var.isShowing()) {
            aq0Var.I.d(true);
        }
    }
}
