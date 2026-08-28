package org.telegram.ui;
public final class xe0 implements org.telegram.ui.ActionBar.b2 {
    public final int f44505a;
    public final jf0 f44506b;

    public xe0(jf0 jf0Var, int i9) {
        this.f44505a = i9;
        this.f44506b = jf0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f44505a) {
            case 0:
                jf0 jf0Var = this.f44506b;
                jf0Var.c(true);
                jf0Var.f39488o0.u1(0, true, null, true);
                return;
            default:
                this.f44506b.f39488o0.u1(0, true, null, true);
                return;
        }
    }
}
