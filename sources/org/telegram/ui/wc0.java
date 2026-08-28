package org.telegram.ui;
public final class wc0 implements org.telegram.ui.ActionBar.b2 {
    public final int f43727a;
    public final fg0 f43728b;

    public wc0(fg0 fg0Var, int i9) {
        this.f43727a = i9;
        this.f43728b = fg0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f43727a) {
            case 0:
                fg0 fg0Var = this.f43728b;
                fg0Var.f38261b[fg0Var.f38259a].d();
                fg0Var.k1(true, true);
                return;
            default:
                fg0 fg0Var2 = this.f43728b;
                fg0Var2.f38271h0 = true;
                if (fg0Var2.f38259a != 0) {
                    fg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
