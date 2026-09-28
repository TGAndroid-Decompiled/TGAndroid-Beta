package org.telegram.ui;
public final class wp0 extends org.telegram.ui.ActionBar.j {
    public final cq0 f39740a;

    public wp0(cq0 cq0Var) {
        this.f39740a = cq0Var;
    }

    @Override
    public final void b(int i10) {
        cq0 cq0Var = this.f39740a;
        if (i10 == -1) {
            cq0Var.finishFragment();
        } else if (i10 == 1) {
            if (cq0Var.V != null) {
                cq0Var.finishFragment(false);
                cq0Var.V.b();
            }
        } else if (i10 == 2) {
            cq0.U(cq0Var, null);
        }
    }
}
