package org.telegram.ui;
public final class uf1 implements org.telegram.ui.ActionBar.b2 {
    public final int f44122a;
    public final dg1 f44123b;

    public uf1(dg1 dg1Var, int i10) {
        this.f44122a = i10;
        this.f44123b = dg1Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f44122a) {
            case 0:
                this.f44123b.finishFragment();
                return;
            case 1:
                dg1 dg1Var = this.f44123b;
                dg1Var.C0();
                dg1Var.finishFragment();
                return;
            case 2:
                dg1 dg1Var2 = this.f44123b;
                dg1Var2.R = "";
                dg1Var2.F0(false);
                return;
            case 3:
                dg1.b0(this.f44123b);
                return;
            default:
                dg1.Y(this.f44123b);
                return;
        }
    }
}
