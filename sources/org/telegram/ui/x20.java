package org.telegram.ui;

import android.view.ViewGroup;
public final class x20 extends s4.l {
    public final v50 F;

    public x20(v50 v50Var) {
        this.F = v50Var;
    }

    @Override
    public final void P(s4.e1 e1Var) {
        ViewGroup viewGroup;
        v50 v50Var = this.F;
        v50Var.Q.invalidate();
        v50Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.k3) v50Var).containerView;
        viewGroup.invalidate();
        v50.J0(v50Var);
    }
}
