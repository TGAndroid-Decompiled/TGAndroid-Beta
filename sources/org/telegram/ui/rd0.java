package org.telegram.ui;
public final class rd0 implements org.telegram.ui.ActionBar.b2 {
    public final int f37195a;
    public final yg0 f37196b;

    public rd0(yg0 yg0Var, int i10) {
        this.f37195a = i10;
        this.f37196b = yg0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f37195a) {
            case 0:
                yg0 yg0Var = this.f37196b;
                yg0Var.f39885b[yg0Var.f39883a].d();
                yg0Var.k1(true, true);
                return;
            default:
                yg0 yg0Var2 = this.f37196b;
                yg0Var2.f39898l0 = true;
                if (yg0Var2.f39883a != 0) {
                    yg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
