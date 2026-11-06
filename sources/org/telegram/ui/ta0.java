package org.telegram.ui;
public final class ta0 implements org.telegram.ui.ActionBar.r1 {
    public final int f50000a;
    public final ce0 f50001b;

    public ta0(ce0 ce0Var, int i7) {
        this.f50000a = i7;
        this.f50001b = ce0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f50000a) {
            case 0:
                ce0 ce0Var = this.f50001b;
                ce0Var.f44758b[ce0Var.f44756a].d();
                ce0Var.C1(true, true);
                return;
            default:
                ce0 ce0Var2 = this.f50001b;
                ce0Var2.f44772l0 = true;
                if (ce0Var2.f44756a != 0) {
                    ce0Var2.M1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
