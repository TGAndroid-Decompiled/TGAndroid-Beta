package org.telegram.ui;

import android.view.View;
public final class qz0 implements r0.m, org.telegram.ui.ActionBar.q1 {
    public final int f51370a;
    public final tz0 f51371b;

    public qz0(tz0 tz0Var, int i7) {
        this.f51370a = i7;
        this.f51371b = tz0Var;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        tz0 tz0Var = this.f51371b;
        tz0Var.f52390e = I0;
        tz0Var.f52387c.setPadding(I0.f15883a, I0.f15884b, I0.f15885c, I0.d);
        tz0Var.f52385b.requestLayout();
        return r0.l1.f56267b;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f51370a) {
            case 1:
                org.telegram.ui.ActionBar.t1 t1Var2 = this.f51371b.f52389d0;
                if (t1Var2 != null) {
                    t1Var2.dismiss();
                    return;
                }
                return;
            default:
                tz0 tz0Var = this.f51371b;
                org.telegram.ui.ActionBar.t1 t1Var3 = tz0Var.f52389d0;
                if (t1Var3 != null) {
                    t1Var3.dismiss();
                    tz0Var.f52389d0 = null;
                }
                tz0Var.dismiss();
                return;
        }
    }
}
