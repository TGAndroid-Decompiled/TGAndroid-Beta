package org.telegram.ui;
public final class ra1 implements org.telegram.ui.ActionBar.q1 {
    public final int f51679a;
    public final za1 f51680b;

    public ra1(za1 za1Var, int i7) {
        this.f51679a = i7;
        this.f51680b = za1Var;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f51679a) {
            case 0:
                this.f51680b.finishFragment();
                return;
            case 1:
                za1 za1Var = this.f51680b;
                za1Var.G0();
                za1Var.finishFragment();
                return;
            case 2:
                za1 za1Var2 = this.f51680b;
                za1Var2.S = "";
                za1Var2.J0(false);
                return;
            case 3:
                za1.f0(this.f51680b);
                return;
            default:
                za1.c0(this.f51680b);
                return;
        }
    }
}
