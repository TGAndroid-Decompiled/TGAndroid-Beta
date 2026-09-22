package yh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.yl0;
public final class z6 extends m61 {
    public final w7 N;

    public z6(w7 w7Var, yl0 yl0Var, Activity activity, int i10, int i11, hi.a aVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(yl0Var, activity, i10, i11, true, aVar, f6Var);
        this.N = w7Var;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        if (i10 == 42) {
            w7 w7Var = this.N;
            Activity parentActivity = w7Var.getParentActivity();
            int i11 = org.telegram.ui.ActionBar.j6.L6;
            f6Var = ((org.telegram.ui.ActionBar.n2) w7Var).resourceProvider;
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(parentActivity, i11, 21, 0, false, f6Var);
            n4Var.setHeight(25);
            return new s4.c1(n4Var);
        }
        return super.x(viewGroup, i10);
    }
}
