package org.telegram.ui;
public final class vj0 implements org.telegram.ui.ActionBar.r1 {
    public final int f50712a;
    public final zj0 f50713b;

    public vj0(zj0 zj0Var, int i7) {
        this.f50712a = i7;
        this.f50713b = zj0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f50712a) {
            case 0:
                zj0 zj0Var = this.f50713b;
                zj0Var.c(true);
                zj0Var.Q.finishFragment();
                return;
            default:
                zj0 zj0Var2 = this.f50713b;
                zj0Var2.c(true);
                zj0Var2.Q.O1(null, 0, true);
                return;
        }
    }
}
