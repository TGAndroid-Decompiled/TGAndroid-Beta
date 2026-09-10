package xh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.vl0;
public final class c7 extends j61 {
    public final z7 N;

    public c7(z7 z7Var, vl0 vl0Var, Activity activity, int i10, int i11, gi.a aVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(vl0Var, activity, i10, i11, true, aVar, f6Var);
        this.N = z7Var;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        if (i10 == 42) {
            z7 z7Var = this.N;
            Activity parentActivity = z7Var.getParentActivity();
            int i11 = org.telegram.ui.ActionBar.j6.L6;
            f6Var = ((org.telegram.ui.ActionBar.p2) z7Var).resourceProvider;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i11, 21, 0, false, f6Var);
            m4Var.setHeight(25);
            return new s4.c1(m4Var);
        }
        return super.x(viewGroup, i10);
    }
}
