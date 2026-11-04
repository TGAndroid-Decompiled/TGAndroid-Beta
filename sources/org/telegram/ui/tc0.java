package org.telegram.ui;
public final class tc0 implements org.telegram.ui.ActionBar.p1 {
    public final int f49771a;
    public final dd0 f49772b;

    public tc0(dd0 dd0Var, int i3) {
        this.f49771a = i3;
        this.f49772b = dd0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f49771a) {
            case 0:
                dd0 dd0Var = this.f49772b;
                dd0Var.c(true);
                dd0Var.f44663v0.D1(0, true, null, true);
                return;
            default:
                this.f49772b.f44663v0.D1(0, true, null, true);
                return;
        }
    }
}
