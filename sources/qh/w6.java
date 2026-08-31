package qh;

import android.view.ViewGroup;
public final class w6 extends f2.l {
    public final b7 F;

    public w6(b7 b7Var) {
        this.F = b7Var;
    }

    @Override
    public final void P(f2.m1 m1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.F).containerView;
        viewGroup.invalidate();
    }
}
