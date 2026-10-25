package org.telegram.ui;
public final class wc0 implements org.telegram.ui.ActionBar.b2 {
    public final int f45097a;
    public final gg0 f45098b;

    public wc0(gg0 gg0Var, int i10) {
        this.f45097a = i10;
        this.f45098b = gg0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f45097a) {
            case 0:
                gg0 gg0Var = this.f45098b;
                gg0Var.f39650b[gg0Var.f39648a].d();
                gg0Var.p1(true, true);
                return;
            default:
                gg0 gg0Var2 = this.f45098b;
                gg0Var2.f39663l0 = true;
                if (gg0Var2.f39648a != 0) {
                    gg0Var2.z1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
