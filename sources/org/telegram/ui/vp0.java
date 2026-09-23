package org.telegram.ui;

import android.view.KeyEvent;
public final class vp0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.l1 {
    public final int f38463a;
    public final dq0 f38464b;

    public vp0(dq0 dq0Var, int i10) {
        this.f38463a = i10;
        this.f38464b = dq0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f38463a) {
            case 0:
                dq0 dq0Var = this.f38464b;
                dq0Var.V(dq0Var.f32696b, dq0Var.f32697c, z10, i10);
                dq0Var.finishFragment();
                return;
            default:
                dq0 dq0Var2 = this.f38464b;
                dq0Var2.V(dq0Var2.f32696b, dq0Var2.f32697c, z10, i10);
                dq0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        dq0 dq0Var = this.f38464b;
        dq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = dq0Var.I) != null && n1Var.isShowing()) {
            dq0Var.I.d(true);
        }
    }
}
