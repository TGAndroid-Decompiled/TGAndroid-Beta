package org.telegram.ui;
public final class va0 implements org.telegram.ui.ActionBar.r1 {
    public final int f50625a;
    public final ee0 f50626b;

    public va0(ee0 ee0Var, int i7) {
        this.f50625a = i7;
        this.f50626b = ee0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f50625a) {
            case 0:
                ee0 ee0Var = this.f50626b;
                ee0Var.f45370b[ee0Var.f45368a].d();
                ee0Var.C1(true, true);
                return;
            default:
                ee0 ee0Var2 = this.f50626b;
                ee0Var2.f45384l0 = true;
                if (ee0Var2.f45368a != 0) {
                    ee0Var2.M1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
