package org.telegram.ui;

import android.view.ViewGroup;
public final class u30 extends s4.j {
    public final f60 F;

    public u30(f60 f60Var) {
        this.F = f60Var;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        f60 f60Var = this.F;
        f60Var.Q.invalidate();
        f60Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) f60Var).containerView;
        viewGroup.invalidate();
        f60.J0(f60Var);
    }
}
