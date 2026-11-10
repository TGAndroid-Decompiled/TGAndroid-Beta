package org.telegram.ui;
public final class wj0 implements org.telegram.ui.ActionBar.r1 {
    public final int f51386a;
    public final ak0 f51387b;

    public wj0(ak0 ak0Var, int i7) {
        this.f51386a = i7;
        this.f51387b = ak0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f51386a) {
            case 0:
                ak0 ak0Var = this.f51387b;
                ak0Var.c(true);
                ak0Var.Q.finishFragment();
                return;
            default:
                ak0 ak0Var2 = this.f51387b;
                ak0Var2.c(true);
                ak0Var2.Q.O1(null, 0, true);
                return;
        }
    }
}
