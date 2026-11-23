package org.telegram.ui;
public final class uc0 implements org.telegram.ui.ActionBar.q1 {
    public final int f52634a;
    public final gd0 f52635b;

    public uc0(gd0 gd0Var, int i7) {
        this.f52634a = i7;
        this.f52635b = gd0Var;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f52634a) {
            case 0:
                gd0 gd0Var = this.f52635b;
                gd0Var.c(true);
                gd0Var.f48275v0.M1(0, true, null, true);
                return;
            default:
                this.f52635b.f48275v0.M1(0, true, null, true);
                return;
        }
    }
}
