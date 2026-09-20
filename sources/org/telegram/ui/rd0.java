package org.telegram.ui;
public final class rd0 implements org.telegram.ui.ActionBar.a2 {
    public final int f37122a;
    public final yg0 f37123b;

    public rd0(yg0 yg0Var, int i10) {
        this.f37122a = i10;
        this.f37123b = yg0Var;
    }

    @Override
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37122a) {
            case 0:
                yg0 yg0Var = this.f37123b;
                yg0Var.f39911b[yg0Var.f39909a].d();
                yg0Var.k1(true, true);
                return;
            default:
                yg0 yg0Var2 = this.f37123b;
                yg0Var2.f39924l0 = true;
                if (yg0Var2.f39909a != 0) {
                    yg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
