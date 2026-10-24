package org.telegram.ui;
public final class yc0 implements org.telegram.ui.ActionBar.z1 {
    public final int f43822a;
    public final hg0 f43823b;

    public yc0(hg0 hg0Var, int i10) {
        this.f43822a = i10;
        this.f43823b = hg0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f43822a) {
            case 0:
                hg0 hg0Var = this.f43823b;
                hg0Var.f37835b[hg0Var.f37833a].d();
                hg0Var.o1(true, true);
                return;
            default:
                hg0 hg0Var2 = this.f43823b;
                hg0Var2.f37848l0 = true;
                if (hg0Var2.f37833a != 0) {
                    hg0Var2.y1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
