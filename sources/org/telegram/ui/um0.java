package org.telegram.ui;
public final class um0 implements org.telegram.ui.ActionBar.c2 {
    public final int f38976a;
    public final zm0 f38977b;

    public um0(zm0 zm0Var, int i10) {
        this.f38976a = i10;
        this.f38977b = zm0Var;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f38976a) {
            case 0:
                zm0 zm0Var = this.f38977b;
                zm0Var.c(true);
                zm0Var.N.finishFragment();
                return;
            default:
                zm0 zm0Var2 = this.f38977b;
                zm0Var2.c(true);
                zm0Var2.N.K1(null, 0, true);
                return;
        }
    }
}
