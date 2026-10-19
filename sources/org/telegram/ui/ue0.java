package org.telegram.ui;
public final class ue0 implements org.telegram.ui.ActionBar.a2 {
    public final int f41954a;
    public final gf0 f41955b;

    public ue0(gf0 gf0Var, int i10) {
        this.f41954a = i10;
        this.f41955b = gf0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f41954a) {
            case 0:
                gf0 gf0Var = this.f41955b;
                gf0Var.c(true);
                gf0Var.f37335s0.u1(0, true, null, true);
                return;
            default:
                this.f41955b.f37335s0.u1(0, true, null, true);
                return;
        }
    }
}
