package org.telegram.ui;
public final class tf0 implements org.telegram.ui.ActionBar.z1 {
    public final int f40375a;
    public final eg0 f40376b;

    public tf0(eg0 eg0Var, int i10) {
        this.f40375a = i10;
        this.f40376b = eg0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f40375a) {
            case 0:
                eg0 eg0Var = this.f40376b;
                eg0Var.c(true);
                eg0Var.f35566s0.u1(0, true, null, true);
                return;
            default:
                this.f40376b.f35566s0.u1(0, true, null, true);
                return;
        }
    }
}
