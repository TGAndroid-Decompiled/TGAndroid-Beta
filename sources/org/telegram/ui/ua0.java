package org.telegram.ui;
public final class ua0 implements org.telegram.ui.ActionBar.r1 {
    public final int f52495a;
    public final ee0 f52496b;

    public ua0(ee0 ee0Var, int i7) {
        this.f52495a = i7;
        this.f52496b = ee0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f52495a) {
            case 0:
                ee0 ee0Var = this.f52496b;
                ee0Var.f47179b[ee0Var.f47177a].d();
                ee0Var.C1(true, true);
                return;
            default:
                ee0 ee0Var2 = this.f52496b;
                ee0Var2.m0 = true;
                if (ee0Var2.f47177a != 0) {
                    ee0Var2.M1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
