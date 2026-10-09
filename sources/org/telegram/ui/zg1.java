package org.telegram.ui;
public final class zg1 implements org.telegram.ui.ActionBar.a2 {
    public final int f44626a;
    public final ih1 f44627b;

    public zg1(ih1 ih1Var, int i10) {
        this.f44626a = i10;
        this.f44627b = ih1Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f44626a) {
            case 0:
                this.f44627b.finishFragment();
                return;
            case 1:
                ih1 ih1Var = this.f44627b;
                ih1Var.B0();
                ih1Var.finishFragment();
                return;
            case 2:
                ih1 ih1Var2 = this.f44627b;
                ih1Var2.R = "";
                ih1Var2.E0(false);
                return;
            case 3:
                ih1.a0(this.f44627b);
                return;
            default:
                ih1.X(this.f44627b);
                return;
        }
    }
}
