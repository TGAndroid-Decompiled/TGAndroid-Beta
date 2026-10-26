package org.telegram.ui;
public final class ye0 implements org.telegram.ui.ActionBar.b2 {
    public final int f46049a;
    public final jf0 f46050b;

    public ye0(jf0 jf0Var, int i10) {
        this.f46049a = i10;
        this.f46050b = jf0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f46049a) {
            case 0:
                jf0 jf0Var = this.f46050b;
                jf0Var.c(true);
                jf0Var.f40619u0.z1(0, true, null, true);
                return;
            default:
                this.f46050b.f40619u0.z1(0, true, null, true);
                return;
        }
    }
}
