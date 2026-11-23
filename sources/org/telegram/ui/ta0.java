package org.telegram.ui;
public final class ta0 implements org.telegram.ui.ActionBar.q1 {
    public final int f52331a;
    public final de0 f52332b;

    public ta0(de0 de0Var, int i7) {
        this.f52331a = i7;
        this.f52332b = de0Var;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f52331a) {
            case 0:
                de0 de0Var = this.f52332b;
                de0Var.f47051b[de0Var.f47049a].d();
                de0Var.C1(true, true);
                return;
            default:
                de0 de0Var2 = this.f52332b;
                de0Var2.m0 = true;
                if (de0Var2.f47049a != 0) {
                    de0Var2.M1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
