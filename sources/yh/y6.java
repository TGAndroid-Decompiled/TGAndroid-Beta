package yh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.wl0;
public final class y6 extends l61 {
    public final v7 N;

    public y6(v7 v7Var, wl0 wl0Var, Activity activity, int i10, int i11, hi.a aVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(wl0Var, activity, i10, i11, true, aVar, e6Var);
        this.N = v7Var;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        if (i10 == 42) {
            v7 v7Var = this.N;
            Activity parentActivity = v7Var.getParentActivity();
            int i11 = org.telegram.ui.ActionBar.j6.L6;
            e6Var = ((org.telegram.ui.ActionBar.n2) v7Var).resourceProvider;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i11, 21, 0, false, e6Var);
            m4Var.setHeight(25);
            return new s4.c1(m4Var);
        }
        return super.x(viewGroup, i10);
    }
}
