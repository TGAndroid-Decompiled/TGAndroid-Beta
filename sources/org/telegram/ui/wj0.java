package org.telegram.ui;
public final class wj0 implements org.telegram.ui.ActionBar.q1 {
    public final int f52920a;
    public final ak0 f52921b;

    public wj0(ak0 ak0Var, int i7) {
        this.f52920a = i7;
        this.f52921b = ak0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f52920a) {
            case 0:
                ak0 ak0Var = this.f52921b;
                ak0Var.c(true);
                ak0Var.R.finishFragment();
                return;
            default:
                ak0 ak0Var2 = this.f52921b;
                ak0Var2.c(true);
                ak0Var2.R.O1(null, 0, true);
                return;
        }
    }
}
