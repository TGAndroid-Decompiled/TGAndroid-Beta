package org.telegram.ui;

import android.view.ViewGroup;
public final class y30 extends s4.j {
    public final j60 F;

    public y30(j60 j60Var) {
        this.F = j60Var;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        j60 j60Var = this.F;
        j60Var.Q.invalidate();
        j60Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.h3) j60Var).containerView;
        viewGroup.invalidate();
        j60.J0(j60Var);
    }
}
