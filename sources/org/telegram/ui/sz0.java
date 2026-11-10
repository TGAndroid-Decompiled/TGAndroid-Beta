package org.telegram.ui;

import android.view.View;
public final class sz0 implements r0.m, org.telegram.ui.ActionBar.r1 {
    public final int f50000a;
    public final vz0 f50001b;

    public sz0(vz0 vz0Var, int i7) {
        this.f50000a = i7;
        this.f50001b = vz0Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        vz0 vz0Var = this.f50001b;
        vz0Var.f50836e = I0;
        vz0Var.f50833c.setPadding(I0.f15122a, I0.f15123b, I0.f15124c, I0.d);
        vz0Var.f50831b.requestLayout();
        return r0.k1.f54212b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f50000a) {
            case 1:
                org.telegram.ui.ActionBar.u1 u1Var2 = this.f50001b.f50834c0;
                if (u1Var2 != null) {
                    u1Var2.dismiss();
                    return;
                }
                return;
            default:
                vz0 vz0Var = this.f50001b;
                org.telegram.ui.ActionBar.u1 u1Var3 = vz0Var.f50834c0;
                if (u1Var3 != null) {
                    u1Var3.dismiss();
                    vz0Var.f50834c0 = null;
                }
                vz0Var.dismiss();
                return;
        }
    }
}
