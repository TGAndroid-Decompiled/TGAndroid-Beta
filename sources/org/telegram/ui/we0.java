package org.telegram.ui;
public final class we0 implements org.telegram.ui.ActionBar.a2 {
    public final int f42524a;
    public final jf0 f42525b;

    public we0(jf0 jf0Var, int i10) {
        this.f42524a = i10;
        this.f42525b = jf0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42524a) {
            case 0:
                jf0 jf0Var = this.f42525b;
                jf0Var.c(true);
                jf0Var.f38174s0.u1(0, true, null, true);
                return;
            default:
                this.f42525b.f38174s0.u1(0, true, null, true);
                return;
        }
    }
}
