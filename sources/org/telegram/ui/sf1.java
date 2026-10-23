package org.telegram.ui;
public final class sf1 implements org.telegram.ui.ActionBar.z1 {
    public final int f41403a;
    public final bg1 f41404b;

    public sf1(bg1 bg1Var, int i10) {
        this.f41403a = i10;
        this.f41404b = bg1Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f41403a) {
            case 0:
                this.f41404b.finishFragment();
                return;
            case 1:
                bg1 bg1Var = this.f41404b;
                bg1Var.B0();
                bg1Var.finishFragment();
                return;
            case 2:
                bg1 bg1Var2 = this.f41404b;
                bg1Var2.R = "";
                bg1Var2.E0(false);
                return;
            case 3:
                bg1.a0(this.f41404b);
                return;
            default:
                bg1.X(this.f41404b);
                return;
        }
    }
}
