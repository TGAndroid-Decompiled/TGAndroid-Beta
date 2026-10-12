package yh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.wm0;
public final class s6 extends h71 {
    public final p7 N;

    public s6(p7 p7Var, wm0 wm0Var, Activity activity, int i10, int i11, hi.a aVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(wm0Var, activity, i10, i11, true, aVar, c6Var);
        this.N = p7Var;
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        if (i10 == 42) {
            p7 p7Var = this.N;
            Activity parentActivity = p7Var.getParentActivity();
            int i11 = org.telegram.ui.ActionBar.h6.L6;
            c6Var = ((org.telegram.ui.ActionBar.m2) p7Var).resourceProvider;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i11, 21, 0, false, c6Var);
            m4Var.setHeight(25);
            return new s4.d1(m4Var);
        }
        return super.x(viewGroup, i10);
    }
}
