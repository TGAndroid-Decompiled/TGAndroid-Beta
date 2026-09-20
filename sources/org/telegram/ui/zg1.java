package org.telegram.ui;
public final class zg1 implements org.telegram.ui.ActionBar.a2 {
    public final int f40217a;
    public final ih1 f40218b;

    public zg1(ih1 ih1Var, int i10) {
        this.f40217a = i10;
        this.f40218b = ih1Var;
    }

    @Override
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40217a) {
            case 0:
                this.f40218b.finishFragment();
                return;
            case 1:
                ih1 ih1Var = this.f40218b;
                ih1Var.B0();
                ih1Var.finishFragment();
                return;
            case 2:
                ih1 ih1Var2 = this.f40218b;
                ih1Var2.R = "";
                ih1Var2.E0(false);
                return;
            case 3:
                ih1.a0(this.f40218b);
                return;
            default:
                ih1.X(this.f40218b);
                return;
        }
    }
}
