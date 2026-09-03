package rh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
import ph.d4;
public final class e extends w51 {
    public final j K;

    public e(j jVar, rl0 rl0Var, Activity activity, int i10, int i11, d4 d4Var, f6 f6Var) {
        super(rl0Var, activity, i10, i11, true, d4Var, f6Var);
        this.K = jVar;
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        if (i10 == 42) {
            j jVar = this.K;
            Activity parentActivity = jVar.getParentActivity();
            int i11 = j6.L6;
            f6Var = ((org.telegram.ui.ActionBar.p2) jVar).resourceProvider;
            l4 l4Var = new l4(parentActivity, i11, 21, 0, false, f6Var);
            l4Var.setHeight(25);
            return new f2.l1(l4Var);
        }
        return super.x(viewGroup, i10);
    }
}
