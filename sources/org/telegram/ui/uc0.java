package org.telegram.ui;
public final class uc0 implements org.telegram.ui.ActionBar.q1 {
    public final int f51906a;
    public final ed0 f51907b;

    public uc0(ed0 ed0Var, int i7) {
        this.f51906a = i7;
        this.f51907b = ed0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f51906a) {
            case 0:
                ed0 ed0Var = this.f51907b;
                ed0Var.c(true);
                ed0Var.f46759v0.M1(0, true, null, true);
                return;
            default:
                this.f51907b.f46759v0.M1(0, true, null, true);
                return;
        }
    }
}
