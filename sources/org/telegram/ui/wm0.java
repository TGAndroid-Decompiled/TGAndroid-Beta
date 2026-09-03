package org.telegram.ui;
public final class wm0 implements org.telegram.ui.ActionBar.c2 {
    public final int f42821a;
    public final bn0 f42822b;

    public wm0(bn0 bn0Var, int i10) {
        this.f42821a = i10;
        this.f42822b = bn0Var;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f42821a) {
            case 0:
                bn0 bn0Var = this.f42822b;
                bn0Var.c(true);
                bn0Var.N.finishFragment();
                return;
            default:
                bn0 bn0Var2 = this.f42822b;
                bn0Var2.c(true);
                bn0Var2.N.K1(null, 0, true);
                return;
        }
    }
}
