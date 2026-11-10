package org.telegram.ui;
public final class ua1 implements org.telegram.ui.ActionBar.r1 {
    public final int f50448a;
    public final cb1 f50449b;

    public ua1(cb1 cb1Var, int i7) {
        this.f50448a = i7;
        this.f50449b = cb1Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f50448a) {
            case 0:
                this.f50449b.finishFragment();
                return;
            case 1:
                cb1 cb1Var = this.f50449b;
                cb1Var.G0();
                cb1Var.finishFragment();
                return;
            case 2:
                cb1 cb1Var2 = this.f50449b;
                cb1Var2.R = "";
                cb1Var2.J0(false);
                return;
            case 3:
                cb1.f0(this.f50449b);
                return;
            default:
                cb1.c0(this.f50449b);
                return;
        }
    }
}
