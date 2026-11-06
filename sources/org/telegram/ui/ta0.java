package org.telegram.ui;
public final class ta0 implements org.telegram.ui.ActionBar.r1 {
    public final int f50001a;
    public final ce0 f50002b;

    public ta0(ce0 ce0Var, int i7) {
        this.f50001a = i7;
        this.f50002b = ce0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f50001a) {
            case 0:
                ce0 ce0Var = this.f50002b;
                ce0Var.f44759b[ce0Var.f44757a].d();
                ce0Var.C1(true, true);
                return;
            default:
                ce0 ce0Var2 = this.f50002b;
                ce0Var2.f44773l0 = true;
                if (ce0Var2.f44757a != 0) {
                    ce0Var2.M1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
