package org.telegram.ui;
public final class qm0 implements org.telegram.ui.ActionBar.z1 {
    public final int f40877a;
    public final vm0 f40878b;

    public qm0(vm0 vm0Var, int i10) {
        this.f40877a = i10;
        this.f40878b = vm0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f40877a) {
            case 0:
                vm0 vm0Var = this.f40878b;
                vm0Var.c(true);
                vm0Var.Q.finishFragment();
                return;
            default:
                vm0 vm0Var2 = this.f40878b;
                vm0Var2.c(true);
                vm0Var2.Q.J1(null, 0, true);
                return;
        }
    }
}
