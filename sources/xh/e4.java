package xh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.wm0;
public final class e4 extends h71 {
    public final g4 N;

    public e4(g4 g4Var, wm0 wm0Var, Context context, int i10, hi.a aVar, c6 c6Var) {
        super(wm0Var, context, i10, 0, false, aVar, c6Var);
        this.N = g4Var;
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        c6 c6Var;
        c6 c6Var2;
        g4 g4Var = this.N;
        if (i10 == 0) {
            Context context = g4Var.getContext();
            int i11 = h6.L6;
            c6Var2 = ((org.telegram.ui.ActionBar.e3) g4Var).resourcesProvider;
            return new s4.d1(new org.telegram.ui.Cells.m4(context, i11, 13, 12, 4, false, false, c6Var2));
        } else if (i10 == 42) {
            Context context2 = g4Var.getContext();
            int i12 = h6.L6;
            c6Var = ((org.telegram.ui.ActionBar.e3) g4Var).resourcesProvider;
            return new s4.d1(new org.telegram.ui.Cells.m4(context2, i12, 13, 12, 4, false, true, c6Var));
        } else {
            return super.x(viewGroup, i10);
        }
    }
}
