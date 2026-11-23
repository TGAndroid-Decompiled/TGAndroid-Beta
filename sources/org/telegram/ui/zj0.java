package org.telegram.ui;
public final class zj0 implements org.telegram.ui.ActionBar.q1 {
    public final int f54536a;
    public final dk0 f54537b;

    public zj0(dk0 dk0Var, int i7) {
        this.f54536a = i7;
        this.f54537b = dk0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f54536a) {
            case 0:
                dk0 dk0Var = this.f54537b;
                dk0Var.c(true);
                dk0Var.R.finishFragment();
                return;
            default:
                dk0 dk0Var2 = this.f54537b;
                dk0Var2.c(true);
                dk0Var2.R.O1(null, 0, true);
                return;
        }
    }
}
