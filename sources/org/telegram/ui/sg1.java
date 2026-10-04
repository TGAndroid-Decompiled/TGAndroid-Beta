package org.telegram.ui;
public final class sg1 implements org.telegram.ui.ActionBar.a2 {
    public final int f40480a;
    public final bh1 f40481b;

    public sg1(bh1 bh1Var, int i10) {
        this.f40480a = i10;
        this.f40481b = bh1Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40480a) {
            case 0:
                this.f40481b.finishFragment();
                return;
            case 1:
                bh1 bh1Var = this.f40481b;
                bh1Var.B0();
                bh1Var.finishFragment();
                return;
            case 2:
                bh1 bh1Var2 = this.f40481b;
                bh1Var2.R = "";
                bh1Var2.E0(false);
                return;
            case 3:
                bh1.Z(this.f40481b);
                return;
            default:
                bh1.W(this.f40481b);
                return;
        }
    }
}
