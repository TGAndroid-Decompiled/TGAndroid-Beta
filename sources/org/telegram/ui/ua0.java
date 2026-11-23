package org.telegram.ui;
public final class ua0 implements org.telegram.ui.ActionBar.q1 {
    public final int f52513a;
    public final de0 f52514b;

    public ua0(de0 de0Var, int i7) {
        this.f52513a = i7;
        this.f52514b = de0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f52513a) {
            case 0:
                de0 de0Var = this.f52514b;
                de0Var.f46928b[de0Var.f46926a].d();
                de0Var.C1(true, true);
                return;
            default:
                de0 de0Var2 = this.f52514b;
                de0Var2.m0 = true;
                if (de0Var2.f46926a != 0) {
                    de0Var2.M1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
