package org.telegram.ui;
public final class ta1 implements org.telegram.ui.ActionBar.r1 {
    public final int f50137a;
    public final bb1 f50138b;

    public ta1(bb1 bb1Var, int i7) {
        this.f50137a = i7;
        this.f50138b = bb1Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f50137a) {
            case 0:
                this.f50138b.finishFragment();
                return;
            case 1:
                bb1 bb1Var = this.f50138b;
                bb1Var.G0();
                bb1Var.finishFragment();
                return;
            case 2:
                bb1 bb1Var2 = this.f50138b;
                bb1Var2.R = "";
                bb1Var2.J0(false);
                return;
            case 3:
                bb1.f0(this.f50138b);
                return;
            default:
                bb1.c0(this.f50138b);
                return;
        }
    }
}
