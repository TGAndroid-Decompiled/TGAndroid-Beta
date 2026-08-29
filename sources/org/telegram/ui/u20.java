package org.telegram.ui;

import android.view.ViewGroup;
public final class u20 extends f2.l {
    public final r50 F;

    public u20(r50 r50Var) {
        this.F = r50Var;
    }

    @Override
    public final void P(f2.n1 n1Var) {
        ViewGroup viewGroup;
        r50 r50Var = this.F;
        r50Var.M.invalidate();
        r50Var.W1.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) r50Var).containerView;
        viewGroup.invalidate();
        r50.J0(r50Var);
    }
}
