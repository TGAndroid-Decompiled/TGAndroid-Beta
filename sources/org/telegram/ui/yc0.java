package org.telegram.ui;
public final class yc0 implements org.telegram.ui.ActionBar.b2 {
    public final int f44836a;
    public final fg0 f44837b;

    public yc0(fg0 fg0Var, int i10) {
        this.f44836a = i10;
        this.f44837b = fg0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f44836a) {
            case 0:
                fg0 fg0Var = this.f44837b;
                fg0Var.f38153b[fg0Var.f38151a].d();
                fg0Var.k1(true, true);
                return;
            default:
                fg0 fg0Var2 = this.f44837b;
                fg0Var2.f38163h0 = true;
                if (fg0Var2.f38151a != 0) {
                    fg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
