package org.telegram.ui;
public final class zj0 implements org.telegram.ui.ActionBar.r1 {
    public final int f54522a;
    public final dk0 f54523b;

    public zj0(dk0 dk0Var, int i7) {
        this.f54522a = i7;
        this.f54523b = dk0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f54522a) {
            case 0:
                dk0 dk0Var = this.f54523b;
                dk0Var.c(true);
                dk0Var.R.finishFragment();
                return;
            default:
                dk0 dk0Var2 = this.f54523b;
                dk0Var2.c(true);
                dk0Var2.R.O1(null, 0, true);
                return;
        }
    }
}
