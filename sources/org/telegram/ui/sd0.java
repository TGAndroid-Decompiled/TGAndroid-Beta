package org.telegram.ui;
public final class sd0 implements org.telegram.ui.ActionBar.z1 {
    public final int f39792a;
    public final ah0 f39793b;

    public sd0(ah0 ah0Var, int i10) {
        this.f39792a = i10;
        this.f39793b = ah0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f39792a) {
            case 0:
                ah0 ah0Var = this.f39793b;
                ah0Var.f33907b[ah0Var.f33905a].d();
                ah0Var.k1(true, true);
                return;
            default:
                ah0 ah0Var2 = this.f39793b;
                ah0Var2.f33920l0 = true;
                if (ah0Var2.f33905a != 0) {
                    ah0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
