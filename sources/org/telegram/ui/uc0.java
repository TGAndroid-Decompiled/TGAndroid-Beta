package org.telegram.ui;
public final class uc0 implements org.telegram.ui.ActionBar.a2 {
    public final int f41939a;
    public final cg0 f41940b;

    public uc0(cg0 cg0Var, int i10) {
        this.f41939a = i10;
        this.f41940b = cg0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f41939a) {
            case 0:
                cg0 cg0Var = this.f41940b;
                cg0Var.f35966b[cg0Var.f35964a].d();
                cg0Var.k1(true, true);
                return;
            default:
                cg0 cg0Var2 = this.f41940b;
                cg0Var2.f35979l0 = true;
                if (cg0Var2.f35964a != 0) {
                    cg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
