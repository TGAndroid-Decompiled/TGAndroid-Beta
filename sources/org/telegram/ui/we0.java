package org.telegram.ui;
public final class we0 implements org.telegram.ui.ActionBar.b2 {
    public final int f43957a;
    public final if0 f43958b;

    public we0(if0 if0Var, int i10) {
        this.f43957a = i10;
        this.f43958b = if0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f43957a) {
            case 0:
                if0 if0Var = this.f43958b;
                if0Var.c(true);
                if0Var.f39249o0.u1(0, true, null, true);
                return;
            default:
                this.f43958b.f39249o0.u1(0, true, null, true);
                return;
        }
    }
}
