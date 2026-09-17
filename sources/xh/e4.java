package xh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;
public final class e4 extends x51 {
    public final g4 N;

    public e4(g4 g4Var, ml0 ml0Var, Context context, int i10, hi.a aVar, f6 f6Var) {
        super(ml0Var, context, i10, 0, false, aVar, f6Var);
        this.N = g4Var;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        f6 f6Var2;
        g4 g4Var = this.N;
        if (i10 == 0) {
            Context context = g4Var.getContext();
            int i11 = j6.L6;
            f6Var2 = ((org.telegram.ui.ActionBar.g3) g4Var).resourcesProvider;
            return new s4.c1(new org.telegram.ui.Cells.l4(context, i11, 13, 12, 4, false, false, f6Var2));
        } else if (i10 == 42) {
            Context context2 = g4Var.getContext();
            int i12 = j6.L6;
            f6Var = ((org.telegram.ui.ActionBar.g3) g4Var).resourcesProvider;
            return new s4.c1(new org.telegram.ui.Cells.l4(context2, i12, 13, 12, 4, false, true, f6Var));
        } else {
            return super.x(viewGroup, i10);
        }
    }
}
