package org.telegram.ui;
public final class wc0 implements org.telegram.ui.ActionBar.a2 {
    public final int f42482a;
    public final eg0 f42483b;

    public wc0(eg0 eg0Var, int i10) {
        this.f42482a = i10;
        this.f42483b = eg0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42482a) {
            case 0:
                eg0 eg0Var = this.f42483b;
                eg0Var.f36491b[eg0Var.f36489a].d();
                eg0Var.k1(true, true);
                return;
            default:
                eg0 eg0Var2 = this.f42483b;
                eg0Var2.f36504l0 = true;
                if (eg0Var2.f36489a != 0) {
                    eg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
