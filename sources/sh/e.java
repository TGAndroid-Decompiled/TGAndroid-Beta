package sh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import qh.c4;
public final class e extends w51 {
    public final j K;

    public e(j jVar, sl0 sl0Var, Activity activity, int i10, int i11, c4 c4Var, g6 g6Var) {
        super(sl0Var, activity, i10, i11, true, c4Var, g6Var);
        this.K = jVar;
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        g6 g6Var;
        if (i10 == 42) {
            j jVar = this.K;
            Activity parentActivity = jVar.getParentActivity();
            int i11 = k6.L6;
            g6Var = ((org.telegram.ui.ActionBar.p2) jVar).resourceProvider;
            m4 m4Var = new m4(parentActivity, i11, 21, 0, false, g6Var);
            m4Var.setHeight(25);
            return new f2.m1(m4Var);
        }
        return super.x(viewGroup, i10);
    }
}
