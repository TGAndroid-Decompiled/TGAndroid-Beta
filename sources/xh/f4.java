package xh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.xl0;
public final class f4 extends k61 {
    public final h4 N;

    public f4(h4 h4Var, xl0 xl0Var, Context context, int i10, hi.a aVar, d6 d6Var) {
        super(xl0Var, context, i10, 0, false, aVar, d6Var);
        this.N = h4Var;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        d6 d6Var2;
        h4 h4Var = this.N;
        if (i10 == 0) {
            Context context = h4Var.getContext();
            int i11 = h6.L6;
            d6Var2 = ((org.telegram.ui.ActionBar.e3) h4Var).resourcesProvider;
            return new s4.c1(new org.telegram.ui.Cells.m4(context, i11, 13, 12, 4, false, false, d6Var2));
        } else if (i10 == 42) {
            Context context2 = h4Var.getContext();
            int i12 = h6.L6;
            d6Var = ((org.telegram.ui.ActionBar.e3) h4Var).resourcesProvider;
            return new s4.c1(new org.telegram.ui.Cells.m4(context2, i12, 13, 12, 4, false, true, d6Var));
        } else {
            return super.x(viewGroup, i10);
        }
    }
}
