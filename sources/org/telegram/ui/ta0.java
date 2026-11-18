package org.telegram.ui;
public final class ta0 implements org.telegram.ui.ActionBar.r1 {
    public final int f52231a;
    public final de0 f52232b;

    public ta0(de0 de0Var, int i7) {
        this.f52231a = i7;
        this.f52232b = de0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f52231a) {
            case 0:
                de0 de0Var = this.f52232b;
                de0Var.f46935b[de0Var.f46933a].d();
                de0Var.C1(true, true);
                return;
            default:
                de0 de0Var2 = this.f52232b;
                de0Var2.m0 = true;
                if (de0Var2.f46933a != 0) {
                    de0Var2.M1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
