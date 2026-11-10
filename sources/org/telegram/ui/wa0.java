package org.telegram.ui;
public final class wa0 implements org.telegram.ui.ActionBar.r1 {
    public final int f50966a;
    public final fe0 f50967b;

    public wa0(fe0 fe0Var, int i7) {
        this.f50966a = i7;
        this.f50967b = fe0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f50966a) {
            case 0:
                fe0 fe0Var = this.f50967b;
                fe0Var.f45694b[fe0Var.f45692a].d();
                fe0Var.C1(true, true);
                return;
            default:
                fe0 fe0Var2 = this.f50967b;
                fe0Var2.f45708l0 = true;
                if (fe0Var2.f45692a != 0) {
                    fe0Var2.M1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
