package org.telegram.ui;
public final class wf1 implements org.telegram.ui.ActionBar.b2 {
    public final int f44991a;
    public final fg1 f44992b;

    public wf1(fg1 fg1Var, int i10) {
        this.f44991a = i10;
        this.f44992b = fg1Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f44991a) {
            case 0:
                this.f44992b.finishFragment();
                return;
            case 1:
                fg1 fg1Var = this.f44992b;
                fg1Var.C0();
                fg1Var.finishFragment();
                return;
            case 2:
                fg1 fg1Var2 = this.f44992b;
                fg1Var2.R = "";
                fg1Var2.F0(false);
                return;
            case 3:
                fg1.b0(this.f44992b);
                return;
            default:
                fg1.Y(this.f44992b);
                return;
        }
    }
}
