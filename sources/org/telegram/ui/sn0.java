package org.telegram.ui;

import android.view.KeyEvent;
public final class sn0 implements org.telegram.ui.Components.q4, org.telegram.ui.ActionBar.i1 {
    public final int f41420a;
    public final wn0 f41421b;

    public sn0(wn0 wn0Var, int i10) {
        this.f41420a = i10;
        this.f41421b = wn0Var;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        switch (this.f41420a) {
            case 0:
                wn0 wn0Var = this.f41421b;
                wn0Var.a0(wn0Var.f43132b, wn0Var.f43133c, z10, i10);
                wn0Var.finishFragment();
                return;
            default:
                wn0 wn0Var2 = this.f41421b;
                wn0Var2.a0(wn0Var2.f43132b, wn0Var2.f43133c, z10, i10);
                wn0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        wn0 wn0Var = this.f41421b;
        wn0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var = wn0Var.I) != null && k1Var.isShowing()) {
            wn0Var.I.d(true);
        }
    }
}
