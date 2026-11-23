package org.telegram.ui;
public final class vc0 implements org.telegram.ui.ActionBar.q1 {
    public final int f52772a;
    public final gd0 f52773b;

    public vc0(gd0 gd0Var, int i7) {
        this.f52772a = i7;
        this.f52773b = gd0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f52772a) {
            case 0:
                gd0 gd0Var = this.f52773b;
                gd0Var.c(true);
                gd0Var.f48028v0.M1(0, true, null, true);
                return;
            default:
                this.f52773b.f48028v0.M1(0, true, null, true);
                return;
        }
    }
}
