package yh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.qm0;
public final class s6 extends c71 {
    public final p7 N;

    public s6(p7 p7Var, qm0 qm0Var, Activity activity, int i10, int i11, hi.a aVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(qm0Var, activity, i10, i11, true, aVar, e6Var);
        this.N = p7Var;
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        if (i10 == 42) {
            p7 p7Var = this.N;
            Activity parentActivity = p7Var.getParentActivity();
            int i11 = org.telegram.ui.ActionBar.i6.L6;
            e6Var = ((org.telegram.ui.ActionBar.n2) p7Var).resourceProvider;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i11, 21, 0, false, e6Var);
            m4Var.setHeight(25);
            return new s4.d1(m4Var);
        }
        return super.x(viewGroup, i10);
    }
}
