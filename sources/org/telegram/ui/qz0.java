package org.telegram.ui;

import android.view.View;
public final class qz0 implements r0.m, org.telegram.ui.ActionBar.r1 {
    public final int f51346a;
    public final tz0 f51347b;

    public qz0(tz0 tz0Var, int i7) {
        this.f51346a = i7;
        this.f51347b = tz0Var;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        tz0 tz0Var = this.f51347b;
        tz0Var.f52384e = I0;
        tz0Var.f52381c.setPadding(I0.f15889a, I0.f15890b, I0.f15891c, I0.d);
        tz0Var.f52379b.requestLayout();
        return r0.l1.f56257b;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f51346a) {
            case 1:
                org.telegram.ui.ActionBar.u1 u1Var2 = this.f51347b.f52383d0;
                if (u1Var2 != null) {
                    u1Var2.dismiss();
                    return;
                }
                return;
            default:
                tz0 tz0Var = this.f51347b;
                org.telegram.ui.ActionBar.u1 u1Var3 = tz0Var.f52383d0;
                if (u1Var3 != null) {
                    u1Var3.dismiss();
                    tz0Var.f52383d0 = null;
                }
                tz0Var.dismiss();
                return;
        }
    }
}
