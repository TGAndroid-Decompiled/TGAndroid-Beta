package org.telegram.ui;

import android.view.ViewGroup;
public final class z20 extends s4.l {
    public final x50 F;

    public z20(x50 x50Var) {
        this.F = x50Var;
    }

    @Override
    public final void P(s4.e1 e1Var) {
        ViewGroup viewGroup;
        x50 x50Var = this.F;
        x50Var.Q.invalidate();
        x50Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.k3) x50Var).containerView;
        viewGroup.invalidate();
        x50.J0(x50Var);
    }
}
