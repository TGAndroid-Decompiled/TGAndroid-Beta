package org.telegram.ui;
public final class sf0 implements org.telegram.ui.ActionBar.z1 {
    public final int f39810a;
    public final dg0 f39811b;

    public sf0(dg0 dg0Var, int i10) {
        this.f39810a = i10;
        this.f39811b = dg0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f39810a) {
            case 0:
                dg0 dg0Var = this.f39811b;
                dg0Var.c(true);
                dg0Var.f35010s0.u1(0, true, null, true);
                return;
            default:
                this.f39811b.f35010s0.u1(0, true, null, true);
                return;
        }
    }
}
