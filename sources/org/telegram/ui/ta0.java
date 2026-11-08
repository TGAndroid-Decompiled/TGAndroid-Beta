package org.telegram.ui;
public final class ta0 implements org.telegram.ui.ActionBar.r1 {
    public final int f49998a;
    public final ce0 f49999b;

    public ta0(ce0 ce0Var, int i7) {
        this.f49998a = i7;
        this.f49999b = ce0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f49998a) {
            case 0:
                ce0 ce0Var = this.f49999b;
                ce0Var.f44763b[ce0Var.f44761a].d();
                ce0Var.C1(true, true);
                return;
            default:
                ce0 ce0Var2 = this.f49999b;
                ce0Var2.f44777l0 = true;
                if (ce0Var2.f44761a != 0) {
                    ce0Var2.M1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
