package org.telegram.ui;
public final class ta0 implements org.telegram.ui.ActionBar.r1 {
    public final int f49973a;
    public final ce0 f49974b;

    public ta0(ce0 ce0Var, int i7) {
        this.f49973a = i7;
        this.f49974b = ce0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f49973a) {
            case 0:
                ce0 ce0Var = this.f49974b;
                ce0Var.f44738b[ce0Var.f44736a].d();
                ce0Var.C1(true, true);
                return;
            default:
                ce0 ce0Var2 = this.f49974b;
                ce0Var2.f44752l0 = true;
                if (ce0Var2.f44736a != 0) {
                    ce0Var2.M1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
