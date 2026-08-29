package org.telegram.ui;

import android.view.KeyEvent;
public final class zo0 implements org.telegram.ui.Components.b5, org.telegram.ui.ActionBar.m1 {
    public final int f45267a;
    public final hp0 f45268b;

    public zo0(hp0 hp0Var, int i10) {
        this.f45267a = i10;
        this.f45268b = hp0Var;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        switch (this.f45267a) {
            case 0:
                hp0 hp0Var = this.f45268b;
                hp0Var.V(hp0Var.f38985b, hp0Var.f38986c, z10, i10);
                hp0Var.finishFragment();
                return;
            default:
                hp0 hp0Var2 = this.f45268b;
                hp0Var2.V(hp0Var2.f38985b, hp0Var2.f38986c, z10, i10);
                hp0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        hp0 hp0Var = this.f45268b;
        hp0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = hp0Var.E) != null && o1Var.isShowing()) {
            hp0Var.E.d(true);
        }
    }
}
