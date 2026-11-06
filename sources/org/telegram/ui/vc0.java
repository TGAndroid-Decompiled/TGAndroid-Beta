package org.telegram.ui;
public final class vc0 implements org.telegram.ui.ActionBar.r1 {
    public final int f50694a;
    public final gd0 f50695b;

    public vc0(gd0 gd0Var, int i7) {
        this.f50694a = i7;
        this.f50695b = gd0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f50694a) {
            case 0:
                gd0 gd0Var = this.f50695b;
                gd0Var.c(true);
                gd0Var.f45981u0.M1(0, true, null, true);
                return;
            default:
                this.f50695b.f45981u0.M1(0, true, null, true);
                return;
        }
    }
}
