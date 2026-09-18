package org.telegram.ui;
public final class zg1 implements org.telegram.ui.ActionBar.b2 {
    public final int f40256a;
    public final ih1 f40257b;

    public zg1(ih1 ih1Var, int i10) {
        this.f40256a = i10;
        this.f40257b = ih1Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f40256a) {
            case 0:
                this.f40257b.finishFragment();
                return;
            case 1:
                ih1 ih1Var = this.f40257b;
                ih1Var.B0();
                ih1Var.finishFragment();
                return;
            case 2:
                ih1 ih1Var2 = this.f40257b;
                ih1Var2.R = "";
                ih1Var2.E0(false);
                return;
            case 3:
                ih1.a0(this.f40257b);
                return;
            default:
                ih1.X(this.f40257b);
                return;
        }
    }
}
