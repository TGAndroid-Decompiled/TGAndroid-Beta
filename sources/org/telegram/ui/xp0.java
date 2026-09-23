package org.telegram.ui;
public final class xp0 extends org.telegram.ui.ActionBar.j {
    public final dq0 f39639a;

    public xp0(dq0 dq0Var) {
        this.f39639a = dq0Var;
    }

    @Override
    public final void b(int i10) {
        dq0 dq0Var = this.f39639a;
        if (i10 == -1) {
            dq0Var.finishFragment();
        } else if (i10 == 1) {
            if (dq0Var.V != null) {
                dq0Var.finishFragment(false);
                dq0Var.V.b();
            }
        } else if (i10 == 2) {
            dq0.U(dq0Var, null);
        }
    }
}
