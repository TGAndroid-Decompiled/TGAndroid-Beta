package ph;

import android.app.Activity;
import android.view.ViewGroup;
import nh.t4;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
public final class v2 extends k51 {
    public final d3 J;

    public v2(d3 d3Var, jl0 jl0Var, Activity activity, int i10, int i11, t4 t4Var, c6 c6Var) {
        super(jl0Var, activity, i10, i11, true, t4Var, c6Var);
        this.J = d3Var;
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        c6 c6Var;
        if (i10 == 42) {
            d3 d3Var = this.J;
            Activity parentActivity = d3Var.getParentActivity();
            int i11 = g6.L6;
            c6Var = ((org.telegram.ui.ActionBar.o2) d3Var).resourceProvider;
            k4 k4Var = new k4(parentActivity, i11, 21, 0, false, c6Var);
            k4Var.setHeight(25);
            return new f2.n1(k4Var);
        }
        return super.x(viewGroup, i10);
    }
}
