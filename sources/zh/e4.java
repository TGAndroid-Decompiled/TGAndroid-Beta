package zh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
public final class e4 extends k71 {
    public final g4 P;

    public e4(g4 g4Var, nm0 nm0Var, Context context, int i10, q0 q0Var, u6 u6Var) {
        super(nm0Var, context, i10, 0, false, q0Var, u6Var);
        this.P = g4Var;
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        u6 u6Var;
        u6 u6Var2;
        g4 g4Var = this.P;
        if (i10 == 0) {
            Context context = g4Var.getContext();
            int i11 = y6.L6;
            u6Var2 = ((org.telegram.ui.ActionBar.k3) g4Var).resourcesProvider;
            return new s4.e1(new org.telegram.ui.Cells.q4(context, i11, 13, 12, 4, false, false, u6Var2));
        } else if (i10 == 42) {
            Context context2 = g4Var.getContext();
            int i12 = y6.L6;
            u6Var = ((org.telegram.ui.ActionBar.k3) g4Var).resourcesProvider;
            return new s4.e1(new org.telegram.ui.Cells.q4(context2, i12, 13, 12, 4, false, true, u6Var));
        } else {
            return super.x(viewGroup, i10);
        }
    }
}
