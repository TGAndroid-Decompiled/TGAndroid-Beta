package org.telegram.ui;

import android.view.View;
public final class rz0 implements r0.m, org.telegram.ui.ActionBar.r1 {
    public final int f49643a;
    public final uz0 f49644b;

    public rz0(uz0 uz0Var, int i7) {
        this.f49643a = i7;
        this.f49644b = uz0Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        uz0 uz0Var = this.f49644b;
        uz0Var.f50507e = I0;
        uz0Var.f50504c.setPadding(I0.f15120a, I0.f15121b, I0.f15122c, I0.d);
        uz0Var.f50502b.requestLayout();
        return r0.k1.f54213b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f49643a) {
            case 1:
                org.telegram.ui.ActionBar.u1 u1Var2 = this.f49644b.f50505c0;
                if (u1Var2 != null) {
                    u1Var2.dismiss();
                    return;
                }
                return;
            default:
                uz0 uz0Var = this.f49644b;
                org.telegram.ui.ActionBar.u1 u1Var3 = uz0Var.f50505c0;
                if (u1Var3 != null) {
                    u1Var3.dismiss();
                    uz0Var.f50505c0 = null;
                }
                uz0Var.dismiss();
                return;
        }
    }
}
