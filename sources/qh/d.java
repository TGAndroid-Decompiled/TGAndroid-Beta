package qh;

import android.app.Activity;
import android.view.ViewGroup;
import f2.l1;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import ph.d4;
public final class d extends w51 {
    public final g K;

    public d(g gVar, sl0 sl0Var, Activity activity, int i10, int i11, d4 d4Var, f6 f6Var) {
        super(sl0Var, activity, i10, i11, true, d4Var, f6Var);
        this.K = gVar;
    }

    @Override
    public final l1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        if (i10 == 42) {
            g gVar = this.K;
            Activity parentActivity = gVar.getParentActivity();
            int i11 = j6.L6;
            f6Var = ((p2) gVar).resourceProvider;
            m4 m4Var = new m4(parentActivity, i11, 21, 0, false, f6Var);
            m4Var.setHeight(25);
            return new l1(m4Var);
        }
        return super.x(viewGroup, i10);
    }
}
