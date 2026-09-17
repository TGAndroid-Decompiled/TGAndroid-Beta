package org.telegram.ui;
public final class yg1 implements org.telegram.ui.ActionBar.a2 {
    public final int f43144a;
    public final hh1 f43145b;

    public yg1(hh1 hh1Var, int i10) {
        this.f43144a = i10;
        this.f43145b = hh1Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f43144a) {
            case 0:
                this.f43145b.finishFragment();
                return;
            case 1:
                hh1 hh1Var = this.f43145b;
                hh1Var.B0();
                hh1Var.finishFragment();
                return;
            case 2:
                hh1 hh1Var2 = this.f43145b;
                hh1Var2.R = "";
                hh1Var2.E0(false);
                return;
            case 3:
                hh1.a0(this.f43145b);
                return;
            default:
                hh1.X(this.f43145b);
                return;
        }
    }
}
