package org.telegram.ui;
public final class up0 extends org.telegram.ui.ActionBar.j {
    public final aq0 f44513a;

    public up0(aq0 aq0Var) {
        this.f44513a = aq0Var;
    }

    @Override
    public final void b(int i10) {
        aq0 aq0Var = this.f44513a;
        if (i10 == -1) {
            aq0Var.finishFragment();
        } else if (i10 == 1) {
            if (aq0Var.V != null) {
                aq0Var.finishFragment(false);
                aq0Var.V.b();
            }
        } else if (i10 == 2) {
            aq0.V(aq0Var, null);
        }
    }
}
