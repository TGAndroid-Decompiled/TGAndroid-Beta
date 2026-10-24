package org.telegram.ui;
public final class rf1 implements org.telegram.ui.ActionBar.z1 {
    public final int f41150a;
    public final ag1 f41151b;

    public rf1(ag1 ag1Var, int i10) {
        this.f41150a = i10;
        this.f41151b = ag1Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f41150a) {
            case 0:
                this.f41151b.finishFragment();
                return;
            case 1:
                ag1 ag1Var = this.f41151b;
                ag1Var.B0();
                ag1Var.finishFragment();
                return;
            case 2:
                ag1 ag1Var2 = this.f41151b;
                ag1Var2.R = "";
                ag1Var2.E0(false);
                return;
            case 3:
                ag1.a0(this.f41151b);
                return;
            default:
                ag1.X(this.f41151b);
                return;
        }
    }
}
