package org.telegram.ui;
public final class yg1 implements org.telegram.ui.ActionBar.a2 {
    public final int f39849a;
    public final hh1 f39850b;

    public yg1(hh1 hh1Var, int i10) {
        this.f39849a = i10;
        this.f39850b = hh1Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39849a) {
            case 0:
                this.f39850b.finishFragment();
                return;
            case 1:
                hh1 hh1Var = this.f39850b;
                hh1Var.B0();
                hh1Var.finishFragment();
                return;
            case 2:
                hh1 hh1Var2 = this.f39850b;
                hh1Var2.R = "";
                hh1Var2.E0(false);
                return;
            case 3:
                hh1.a0(this.f39850b);
                return;
            default:
                hh1.X(this.f39850b);
                return;
        }
    }
}
