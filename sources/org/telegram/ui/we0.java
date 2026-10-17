package org.telegram.ui;
public final class we0 implements org.telegram.ui.ActionBar.a2 {
    public final int f42500a;
    public final jf0 f42501b;

    public we0(jf0 jf0Var, int i10) {
        this.f42500a = i10;
        this.f42501b = jf0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42500a) {
            case 0:
                jf0 jf0Var = this.f42501b;
                jf0Var.c(true);
                jf0Var.f38158s0.u1(0, true, null, true);
                return;
            default:
                this.f42501b.f38158s0.u1(0, true, null, true);
                return;
        }
    }
}
