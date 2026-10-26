package org.telegram.ui;
public final class wc0 implements org.telegram.ui.ActionBar.b2 {
    public final int f45100a;
    public final gg0 f45101b;

    public wc0(gg0 gg0Var, int i10) {
        this.f45100a = i10;
        this.f45101b = gg0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f45100a) {
            case 0:
                gg0 gg0Var = this.f45101b;
                gg0Var.f39653b[gg0Var.f39651a].d();
                gg0Var.p1(true, true);
                return;
            default:
                gg0 gg0Var2 = this.f45101b;
                gg0Var2.f39666l0 = true;
                if (gg0Var2.f39651a != 0) {
                    gg0Var2.z1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
