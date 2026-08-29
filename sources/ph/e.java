package ph;

import android.app.Activity;
import android.view.ViewGroup;
import nh.t4;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
public final class e extends k51 {
    public final j J;

    public e(j jVar, jl0 jl0Var, Activity activity, int i10, int i11, t4 t4Var, c6 c6Var) {
        super(jl0Var, activity, i10, i11, true, t4Var, c6Var);
        this.J = jVar;
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        c6 c6Var;
        if (i10 == 42) {
            j jVar = this.J;
            Activity parentActivity = jVar.getParentActivity();
            int i11 = g6.L6;
            c6Var = ((org.telegram.ui.ActionBar.o2) jVar).resourceProvider;
            k4 k4Var = new k4(parentActivity, i11, 21, 0, false, c6Var);
            k4Var.setHeight(25);
            return new f2.n1(k4Var);
        }
        return super.x(viewGroup, i10);
    }
}
