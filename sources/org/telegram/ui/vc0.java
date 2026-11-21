package org.telegram.ui;
public final class vc0 implements org.telegram.ui.ActionBar.q1 {
    public final int f52789a;
    public final gd0 f52790b;

    public vc0(gd0 gd0Var, int i7) {
        this.f52789a = i7;
        this.f52790b = gd0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f52789a) {
            case 0:
                gd0 gd0Var = this.f52790b;
                gd0Var.c(true);
                gd0Var.f48080v0.M1(0, true, null, true);
                return;
            default:
                this.f52790b.f48080v0.M1(0, true, null, true);
                return;
        }
    }
}
