package qh;

import android.view.ViewGroup;
public final class v6 extends f2.l {
    public final a7 F;

    public v6(a7 a7Var) {
        this.F = a7Var;
    }

    @Override
    public final void P(f2.m1 m1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.F).containerView;
        viewGroup.invalidate();
    }
}
