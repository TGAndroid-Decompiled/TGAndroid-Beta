package org.telegram.ui;
public final class wc0 implements org.telegram.ui.ActionBar.a2 {
    public final int f42485a;
    public final fg0 f42486b;

    public wc0(fg0 fg0Var, int i10) {
        this.f42485a = i10;
        this.f42486b = fg0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42485a) {
            case 0:
                fg0 fg0Var = this.f42486b;
                fg0Var.f36905b[fg0Var.f36903a].d();
                fg0Var.k1(true, true);
                return;
            default:
                fg0 fg0Var2 = this.f42486b;
                fg0Var2.f36918l0 = true;
                if (fg0Var2.f36903a != 0) {
                    fg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
