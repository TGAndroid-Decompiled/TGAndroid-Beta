package org.telegram.ui;
public final class yg1 implements org.telegram.ui.ActionBar.z1 {
    public final int f44431a;
    public final hh1 f44432b;

    public yg1(hh1 hh1Var, int i10) {
        this.f44431a = i10;
        this.f44432b = hh1Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f44431a) {
            case 0:
                this.f44432b.finishFragment();
                return;
            case 1:
                hh1 hh1Var = this.f44432b;
                hh1Var.B0();
                hh1Var.finishFragment();
                return;
            case 2:
                hh1 hh1Var2 = this.f44432b;
                hh1Var2.R = "";
                hh1Var2.E0(false);
                return;
            case 3:
                hh1.a0(this.f44432b);
                return;
            default:
                hh1.X(this.f44432b);
                return;
        }
    }
}
