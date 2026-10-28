package org.telegram.ui;

import android.view.KeyEvent;
public final class up0 implements org.telegram.ui.Components.e5, org.telegram.ui.ActionBar.m1 {
    public final int f44085a;
    public final cq0 f44086b;

    public up0(cq0 cq0Var, int i10) {
        this.f44085a = i10;
        this.f44086b = cq0Var;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        switch (this.f44085a) {
            case 0:
                cq0 cq0Var = this.f44086b;
                cq0Var.W(cq0Var.f38433b, cq0Var.f38434c, z10, i10);
                cq0Var.finishFragment();
                return;
            default:
                cq0 cq0Var2 = this.f44086b;
                cq0Var2.W(cq0Var2.f38433b, cq0Var2.f38434c, z10, i10);
                cq0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        cq0 cq0Var = this.f44086b;
        cq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = cq0Var.I) != null && o1Var.isShowing()) {
            cq0Var.I.d(true);
        }
    }
}
