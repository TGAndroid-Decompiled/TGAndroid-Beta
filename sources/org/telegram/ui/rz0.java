package org.telegram.ui;

import android.view.View;
public final class rz0 implements r0.m, org.telegram.ui.ActionBar.q1 {
    public final int f51793a;
    public final uz0 f51794b;

    public rz0(uz0 uz0Var, int i7) {
        this.f51793a = i7;
        this.f51794b = uz0Var;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        uz0 uz0Var = this.f51794b;
        uz0Var.f52660e = I0;
        uz0Var.f52657c.setPadding(I0.f15914a, I0.f15915b, I0.f15916c, I0.d);
        uz0Var.f52655b.requestLayout();
        return r0.l1.f56298b;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f51793a) {
            case 1:
                org.telegram.ui.ActionBar.t1 t1Var2 = this.f51794b.f52659d0;
                if (t1Var2 != null) {
                    t1Var2.dismiss();
                    return;
                }
                return;
            default:
                uz0 uz0Var = this.f51794b;
                org.telegram.ui.ActionBar.t1 t1Var3 = uz0Var.f52659d0;
                if (t1Var3 != null) {
                    t1Var3.dismiss();
                    uz0Var.f52659d0 = null;
                }
                uz0Var.dismiss();
                return;
        }
    }
}
