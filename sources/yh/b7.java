package yh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;
public final class b7 extends x51 {
    public final y7 N;

    public b7(y7 y7Var, ml0 ml0Var, Activity activity, int i10, int i11, hi.a aVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(ml0Var, activity, i10, i11, true, aVar, f6Var);
        this.N = y7Var;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        if (i10 == 42) {
            y7 y7Var = this.N;
            Activity parentActivity = y7Var.getParentActivity();
            int i11 = org.telegram.ui.ActionBar.j6.L6;
            f6Var = ((org.telegram.ui.ActionBar.o2) y7Var).resourceProvider;
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(parentActivity, i11, 21, 0, false, f6Var);
            l4Var.setHeight(25);
            return new s4.c1(l4Var);
        }
        return super.x(viewGroup, i10);
    }
}
