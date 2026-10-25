package org.telegram.ui;
public final class ye0 implements org.telegram.ui.ActionBar.b2 {
    public final int f46046a;
    public final jf0 f46047b;

    public ye0(jf0 jf0Var, int i10) {
        this.f46046a = i10;
        this.f46047b = jf0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f46046a) {
            case 0:
                jf0 jf0Var = this.f46047b;
                jf0Var.c(true);
                jf0Var.f40616u0.z1(0, true, null, true);
                return;
            default:
                this.f46047b.f40616u0.z1(0, true, null, true);
                return;
        }
    }
}
