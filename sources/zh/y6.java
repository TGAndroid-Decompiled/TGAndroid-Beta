package zh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
public final class y6 extends v51 {
    public final v7 N;

    public y6(v7 v7Var, ll0 ll0Var, Activity activity, int i10, int i11, ii.a aVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(ll0Var, activity, i10, i11, true, aVar, f6Var);
        this.N = v7Var;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        if (i10 == 42) {
            v7 v7Var = this.N;
            Activity parentActivity = v7Var.getParentActivity();
            int i11 = org.telegram.ui.ActionBar.j6.L6;
            f6Var = ((org.telegram.ui.ActionBar.n2) v7Var).resourceProvider;
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(parentActivity, i11, 21, 0, false, f6Var);
            l4Var.setHeight(25);
            return new s4.c1(l4Var);
        }
        return super.x(viewGroup, i10);
    }
}
