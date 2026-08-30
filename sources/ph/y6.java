package ph;

import android.view.ViewGroup;
public final class y6 extends f2.l {
    public final d7 F;

    public y6(d7 d7Var) {
        this.F = d7Var;
    }

    @Override
    public final void P(f2.l1 l1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.F).containerView;
        viewGroup.invalidate();
    }
}
