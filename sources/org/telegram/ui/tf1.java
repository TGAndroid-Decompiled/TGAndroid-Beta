package org.telegram.ui;
public final class tf1 implements org.telegram.ui.ActionBar.b2 {
    public final int f42701a;
    public final cg1 f42702b;

    public tf1(cg1 cg1Var, int i10) {
        this.f42701a = i10;
        this.f42702b = cg1Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f42701a) {
            case 0:
                this.f42702b.finishFragment();
                return;
            case 1:
                cg1 cg1Var = this.f42702b;
                cg1Var.B0();
                cg1Var.finishFragment();
                return;
            case 2:
                cg1 cg1Var2 = this.f42702b;
                cg1Var2.N = "";
                cg1Var2.E0(false);
                return;
            case 3:
                cg1.a0(this.f42702b);
                return;
            default:
                cg1.X(this.f42702b);
                return;
        }
    }
}
