package org.telegram.ui;
public final class yg1 implements org.telegram.ui.ActionBar.a2 {
    public final int f43143a;
    public final hh1 f43144b;

    public yg1(hh1 hh1Var, int i10) {
        this.f43143a = i10;
        this.f43144b = hh1Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f43143a) {
            case 0:
                this.f43144b.finishFragment();
                return;
            case 1:
                hh1 hh1Var = this.f43144b;
                hh1Var.B0();
                hh1Var.finishFragment();
                return;
            case 2:
                hh1 hh1Var2 = this.f43144b;
                hh1Var2.R = "";
                hh1Var2.E0(false);
                return;
            case 3:
                hh1.a0(this.f43144b);
                return;
            default:
                hh1.X(this.f43144b);
                return;
        }
    }
}
