package org.telegram.ui;

import android.view.KeyEvent;
public final class up0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.k1 {
    public final int f38541a;
    public final cq0 f38542b;

    public up0(cq0 cq0Var, int i10) {
        this.f38541a = i10;
        this.f38542b = cq0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f38541a) {
            case 0:
                cq0 cq0Var = this.f38542b;
                cq0Var.V(cq0Var.f32772b, cq0Var.f32773c, z10, i10);
                cq0Var.finishFragment();
                return;
            default:
                cq0 cq0Var2 = this.f38542b;
                cq0Var2.V(cq0Var2.f32772b, cq0Var2.f32773c, z10, i10);
                cq0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        cq0 cq0Var = this.f38542b;
        cq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = cq0Var.I) != null && m1Var.isShowing()) {
            cq0Var.I.d(true);
        }
    }
}
