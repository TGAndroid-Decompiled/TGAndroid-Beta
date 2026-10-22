package org.telegram.ui;
public final class uc0 implements org.telegram.ui.ActionBar.a2 {
    public final int f41932a;
    public final dg0 f41933b;

    public uc0(dg0 dg0Var, int i10) {
        this.f41932a = i10;
        this.f41933b = dg0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f41932a) {
            case 0:
                dg0 dg0Var = this.f41933b;
                dg0Var.f36372b[dg0Var.f36370a].d();
                dg0Var.k1(true, true);
                return;
            default:
                dg0 dg0Var2 = this.f41933b;
                dg0Var2.f36385l0 = true;
                if (dg0Var2.f36370a != 0) {
                    dg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
