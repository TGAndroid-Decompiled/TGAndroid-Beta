package org.telegram.ui;
public final class ra1 implements org.telegram.ui.ActionBar.r1 {
    public final int f49425a;
    public final za1 f49426b;

    public ra1(za1 za1Var, int i7) {
        this.f49425a = i7;
        this.f49426b = za1Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f49425a) {
            case 0:
                this.f49426b.finishFragment();
                return;
            case 1:
                za1 za1Var = this.f49426b;
                za1Var.G0();
                za1Var.finishFragment();
                return;
            case 2:
                za1 za1Var2 = this.f49426b;
                za1Var2.R = "";
                za1Var2.J0(false);
                return;
            case 3:
                za1.f0(this.f49426b);
                return;
            default:
                za1.c0(this.f49426b);
                return;
        }
    }
}
