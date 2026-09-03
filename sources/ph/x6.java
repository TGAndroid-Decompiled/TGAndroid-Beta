package ph;

import android.view.ViewGroup;
public final class x6 extends f2.l {
    public final c7 F;

    public x6(c7 c7Var) {
        this.F = c7Var;
    }

    @Override
    public final void P(f2.l1 l1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.F).containerView;
        viewGroup.invalidate();
    }
}
