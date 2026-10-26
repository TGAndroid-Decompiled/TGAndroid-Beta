package org.telegram.ui;

import android.view.KeyEvent;
public final class sp0 implements org.telegram.ui.Components.e5, org.telegram.ui.ActionBar.m1 {
    public final int f43571a;
    public final aq0 f43572b;

    public sp0(aq0 aq0Var, int i10) {
        this.f43571a = i10;
        this.f43572b = aq0Var;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        switch (this.f43571a) {
            case 0:
                aq0 aq0Var = this.f43572b;
                aq0Var.W(aq0Var.f37876b, aq0Var.f37877c, z10, i10);
                aq0Var.finishFragment();
                return;
            default:
                aq0 aq0Var2 = this.f43572b;
                aq0Var2.W(aq0Var2.f37876b, aq0Var2.f37877c, z10, i10);
                aq0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        aq0 aq0Var = this.f43572b;
        aq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = aq0Var.I) != null && o1Var.isShowing()) {
            aq0Var.I.d(true);
        }
    }
}
