package org.telegram.ui;
public final class xj0 implements org.telegram.ui.ActionBar.q1 {
    public final int f53984a;
    public final bk0 f53985b;

    public xj0(bk0 bk0Var, int i7) {
        this.f53984a = i7;
        this.f53985b = bk0Var;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f53984a) {
            case 0:
                bk0 bk0Var = this.f53985b;
                bk0Var.c(true);
                bk0Var.R.finishFragment();
                return;
            default:
                bk0 bk0Var2 = this.f53985b;
                bk0Var2.c(true);
                bk0Var2.R.O1(null, 0, true);
                return;
        }
    }
}
