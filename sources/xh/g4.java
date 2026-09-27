package xh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.yl0;
public final class g4 extends l61 {
    public final i4 N;

    public g4(i4 i4Var, yl0 yl0Var, Context context, int i10, hi.a aVar, e6 e6Var) {
        super(yl0Var, context, i10, 0, false, aVar, e6Var);
        this.N = i4Var;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        e6 e6Var;
        e6 e6Var2;
        i4 i4Var = this.N;
        if (i10 == 0) {
            Context context = i4Var.getContext();
            int i11 = i6.L6;
            e6Var2 = ((org.telegram.ui.ActionBar.g3) i4Var).resourcesProvider;
            return new s4.c1(new org.telegram.ui.Cells.m4(context, i11, 13, 12, 4, false, false, e6Var2));
        } else if (i10 == 42) {
            Context context2 = i4Var.getContext();
            int i12 = i6.L6;
            e6Var = ((org.telegram.ui.ActionBar.g3) i4Var).resourcesProvider;
            return new s4.c1(new org.telegram.ui.Cells.m4(context2, i12, 13, 12, 4, false, true, e6Var));
        } else {
            return super.x(viewGroup, i10);
        }
    }
}
