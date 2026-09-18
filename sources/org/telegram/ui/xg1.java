package org.telegram.ui;
public final class xg1 implements org.telegram.ui.ActionBar.a2 {
    public final int f39489a;
    public final gh1 f39490b;

    public xg1(gh1 gh1Var, int i10) {
        this.f39489a = i10;
        this.f39490b = gh1Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39489a) {
            case 0:
                this.f39490b.finishFragment();
                return;
            case 1:
                gh1 gh1Var = this.f39490b;
                gh1Var.B0();
                gh1Var.finishFragment();
                return;
            case 2:
                gh1 gh1Var2 = this.f39490b;
                gh1Var2.R = "";
                gh1Var2.E0(false);
                return;
            case 3:
                gh1.a0(this.f39490b);
                return;
            default:
                gh1.X(this.f39490b);
                return;
        }
    }
}
