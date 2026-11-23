package org.telegram.ui;

import android.view.View;
public final class rz0 implements r0.m, org.telegram.ui.ActionBar.q1 {
    public final int f51797a;
    public final uz0 f51798b;

    public rz0(uz0 uz0Var, int i7) {
        this.f51797a = i7;
        this.f51798b = uz0Var;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        uz0 uz0Var = this.f51798b;
        uz0Var.f52664e = I0;
        uz0Var.f52661c.setPadding(I0.f15917a, I0.f15918b, I0.f15919c, I0.d);
        uz0Var.f52659b.requestLayout();
        return r0.l1.f56302b;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f51797a) {
            case 1:
                org.telegram.ui.ActionBar.t1 t1Var2 = this.f51798b.f52663d0;
                if (t1Var2 != null) {
                    t1Var2.dismiss();
                    return;
                }
                return;
            default:
                uz0 uz0Var = this.f51798b;
                org.telegram.ui.ActionBar.t1 t1Var3 = uz0Var.f52663d0;
                if (t1Var3 != null) {
                    t1Var3.dismiss();
                    uz0Var.f52663d0 = null;
                }
                uz0Var.dismiss();
                return;
        }
    }
}
