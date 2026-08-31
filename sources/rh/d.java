package rh;

import android.app.Activity;
import android.view.ViewGroup;
import f2.m1;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
import qh.d4;
public final class d extends x51 {
    public final g K;

    public d(g gVar, tl0 tl0Var, Activity activity, int i10, int i11, d4 d4Var, g6 g6Var) {
        super(tl0Var, activity, i10, i11, true, d4Var, g6Var);
        this.K = gVar;
    }

    @Override
    public final m1 x(ViewGroup viewGroup, int i10) {
        g6 g6Var;
        if (i10 == 42) {
            g gVar = this.K;
            Activity parentActivity = gVar.getParentActivity();
            int i11 = k6.L6;
            g6Var = ((p2) gVar).resourceProvider;
            m4 m4Var = new m4(parentActivity, i11, 21, 0, false, g6Var);
            m4Var.setHeight(25);
            return new m1(m4Var);
        }
        return super.x(viewGroup, i10);
    }
}
