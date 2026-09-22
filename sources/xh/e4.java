package xh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;
public final class e4 extends w51 {
    public final g4 N;

    public e4(g4 g4Var, ll0 ll0Var, Context context, int i10, hi.a aVar, e6 e6Var) {
        super(ll0Var, context, i10, 0, false, aVar, e6Var);
        this.N = g4Var;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        e6 e6Var;
        e6 e6Var2;
        g4 g4Var = this.N;
        if (i10 == 0) {
            Context context = g4Var.getContext();
            int i11 = i6.L6;
            e6Var2 = ((org.telegram.ui.ActionBar.f3) g4Var).resourcesProvider;
            return new s4.c1(new org.telegram.ui.Cells.m4(context, i11, 13, 12, 4, false, false, e6Var2));
        } else if (i10 == 42) {
            Context context2 = g4Var.getContext();
            int i12 = i6.L6;
            e6Var = ((org.telegram.ui.ActionBar.f3) g4Var).resourcesProvider;
            return new s4.c1(new org.telegram.ui.Cells.m4(context2, i12, 13, 12, 4, false, true, e6Var));
        } else {
            return super.x(viewGroup, i10);
        }
    }
}
