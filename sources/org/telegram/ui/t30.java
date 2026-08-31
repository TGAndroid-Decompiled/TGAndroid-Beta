package org.telegram.ui;

import android.view.ViewGroup;
public final class t30 extends f2.l {
    public final d60 F;

    public t30(d60 d60Var) {
        this.F = d60Var;
    }

    @Override
    public final void P(f2.m1 m1Var) {
        ViewGroup viewGroup;
        d60 d60Var = this.F;
        d60Var.N.invalidate();
        d60Var.X1.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.h3) d60Var).containerView;
        viewGroup.invalidate();
        d60.J0(d60Var);
    }
}
