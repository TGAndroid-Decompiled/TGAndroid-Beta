package org.telegram.ui;
public final class rf1 implements org.telegram.ui.ActionBar.b2 {
    public final int f42414a;
    public final ag1 f42415b;

    public rf1(ag1 ag1Var, int i9) {
        this.f42414a = i9;
        this.f42415b = ag1Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f42414a) {
            case 0:
                this.f42415b.finishFragment();
                return;
            case 1:
                ag1 ag1Var = this.f42415b;
                ag1Var.A0();
                ag1Var.finishFragment();
                return;
            case 2:
                ag1 ag1Var2 = this.f42415b;
                ag1Var2.N = "";
                ag1Var2.D0(false);
                return;
            case 3:
                ag1.Z(this.f42415b);
                return;
            default:
                ag1.W(this.f42415b);
                return;
        }
    }
}
