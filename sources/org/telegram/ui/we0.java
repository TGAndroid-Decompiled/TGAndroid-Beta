package org.telegram.ui;
public final class we0 implements org.telegram.ui.ActionBar.a2 {
    public final int f42497a;
    public final if0 f42498b;

    public we0(if0 if0Var, int i10) {
        this.f42497a = i10;
        this.f42498b = if0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42497a) {
            case 0:
                if0 if0Var = this.f42498b;
                if0Var.c(true);
                if0Var.f37877s0.u1(0, true, null, true);
                return;
            default:
                this.f42498b.f37877s0.u1(0, true, null, true);
                return;
        }
    }
}
