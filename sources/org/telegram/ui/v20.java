package org.telegram.ui;

import android.view.ViewGroup;
public final class v20 extends s4.k {
    public final u50 F;

    public v20(u50 u50Var) {
        this.F = u50Var;
    }

    @Override
    public final void P(s4.b1 b1Var) {
        ViewGroup viewGroup;
        u50 u50Var = this.F;
        u50Var.Q.invalidate();
        u50Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.h3) u50Var).containerView;
        viewGroup.invalidate();
        u50.J0(u50Var);
    }
}
