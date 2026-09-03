package org.telegram.ui;
public final class qp0 extends org.telegram.ui.ActionBar.j {
    public final wp0 f37451a;

    public qp0(wp0 wp0Var) {
        this.f37451a = wp0Var;
    }

    @Override
    public final void b(int i10) {
        wp0 wp0Var = this.f37451a;
        if (i10 == -1) {
            wp0Var.finishFragment();
        } else if (i10 == 1) {
            if (wp0Var.S != null) {
                wp0Var.finishFragment(false);
                wp0Var.S.b();
            }
        } else if (i10 == 2) {
            wp0.U(wp0Var, null);
        }
    }
}
