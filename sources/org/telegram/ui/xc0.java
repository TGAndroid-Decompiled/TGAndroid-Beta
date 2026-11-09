package org.telegram.ui;
public final class xc0 implements org.telegram.ui.ActionBar.r1 {
    public final int f51635a;
    public final id0 f51636b;

    public xc0(id0 id0Var, int i7) {
        this.f51635a = i7;
        this.f51636b = id0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f51635a) {
            case 0:
                id0 id0Var = this.f51636b;
                id0Var.c(true);
                id0Var.f46649u0.M1(0, true, null, true);
                return;
            default:
                this.f51636b.f46649u0.M1(0, true, null, true);
                return;
        }
    }
}
