package org.telegram.ui;
public final class vc0 implements org.telegram.ui.ActionBar.b2 {
    public final int f44244a;
    public final ig0 f44245b;

    public vc0(ig0 ig0Var, int i10) {
        this.f44244a = i10;
        this.f44245b = ig0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f44244a) {
            case 0:
                ig0 ig0Var = this.f44245b;
                ig0Var.f40142b[ig0Var.f40140a].d();
                ig0Var.p1(true, true);
                return;
            default:
                ig0 ig0Var2 = this.f44245b;
                ig0Var2.f40155l0 = true;
                if (ig0Var2.f40140a != 0) {
                    ig0Var2.z1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
