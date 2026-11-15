package org.telegram.ui;
public final class ta0 implements org.telegram.ui.ActionBar.q1 {
    public final int f51515a;
    public final ce0 f51516b;

    public ta0(ce0 ce0Var, int i7) {
        this.f51515a = i7;
        this.f51516b = ce0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f51515a) {
            case 0:
                ce0 ce0Var = this.f51516b;
                ce0Var.f46087b[ce0Var.f46085a].d();
                ce0Var.C1(true, true);
                return;
            default:
                ce0 ce0Var2 = this.f51516b;
                ce0Var2.m0 = true;
                if (ce0Var2.f46085a != 0) {
                    ce0Var2.M1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
