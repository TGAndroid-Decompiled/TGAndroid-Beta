package org.telegram.ui;
public final class vc0 implements org.telegram.ui.ActionBar.r1 {
    public final int f52747a;
    public final hd0 f52748b;

    public vc0(hd0 hd0Var, int i7) {
        this.f52747a = i7;
        this.f52748b = hd0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f52747a) {
            case 0:
                hd0 hd0Var = this.f52748b;
                hd0Var.c(true);
                hd0Var.f48331v0.M1(0, true, null, true);
                return;
            default:
                this.f52748b.f48331v0.M1(0, true, null, true);
                return;
        }
    }
}
