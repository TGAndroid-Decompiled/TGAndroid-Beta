package org.telegram.ui;
public final class wm0 implements org.telegram.ui.ActionBar.z1 {
    public final int f39498a;
    public final bn0 f39499b;

    public wm0(bn0 bn0Var, int i10) {
        this.f39498a = i10;
        this.f39499b = bn0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f39498a) {
            case 0:
                bn0 bn0Var = this.f39499b;
                bn0Var.c(true);
                bn0Var.Q.finishFragment();
                return;
            default:
                bn0 bn0Var2 = this.f39499b;
                bn0Var2.c(true);
                bn0Var2.Q.K1(null, 0, true);
                return;
        }
    }
}
