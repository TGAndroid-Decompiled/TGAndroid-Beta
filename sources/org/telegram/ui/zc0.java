package org.telegram.ui;
public final class zc0 implements org.telegram.ui.ActionBar.z1 {
    public final int f44116a;
    public final ig0 f44117b;

    public zc0(ig0 ig0Var, int i10) {
        this.f44116a = i10;
        this.f44117b = ig0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f44116a) {
            case 0:
                ig0 ig0Var = this.f44117b;
                ig0Var.f38194b[ig0Var.f38192a].d();
                ig0Var.o1(true, true);
                return;
            default:
                ig0 ig0Var2 = this.f44117b;
                ig0Var2.f38207l0 = true;
                if (ig0Var2.f38192a != 0) {
                    ig0Var2.y1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
