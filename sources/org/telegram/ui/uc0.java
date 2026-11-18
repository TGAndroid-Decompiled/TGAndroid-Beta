package org.telegram.ui;
public final class uc0 implements org.telegram.ui.ActionBar.r1 {
    public final int f52520a;
    public final gd0 f52521b;

    public uc0(gd0 gd0Var, int i7) {
        this.f52520a = i7;
        this.f52521b = gd0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f52520a) {
            case 0:
                gd0 gd0Var = this.f52521b;
                gd0Var.c(true);
                gd0Var.f48080v0.M1(0, true, null, true);
                return;
            default:
                this.f52521b.f48080v0.M1(0, true, null, true);
                return;
        }
    }
}
