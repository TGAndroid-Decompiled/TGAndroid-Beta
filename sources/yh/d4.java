package yh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.mm0;
public final class d4 extends b71 {
    public final f4 P;

    public d4(f4 f4Var, mm0 mm0Var, Context context, int i10, t3 t3Var, g6 g6Var) {
        super(mm0Var, context, i10, 0, false, t3Var, g6Var);
        this.P = f4Var;
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        g6 g6Var;
        g6 g6Var2;
        f4 f4Var = this.P;
        if (i10 == 0) {
            Context context = f4Var.getContext();
            int i11 = k6.L6;
            g6Var2 = ((org.telegram.ui.ActionBar.h3) f4Var).resourcesProvider;
            return new s4.b1(new org.telegram.ui.Cells.l4(context, i11, 13, 12, 4, false, false, g6Var2));
        } else if (i10 == 42) {
            Context context2 = f4Var.getContext();
            int i12 = k6.L6;
            g6Var = ((org.telegram.ui.ActionBar.h3) f4Var).resourcesProvider;
            return new s4.b1(new org.telegram.ui.Cells.l4(context2, i12, 13, 12, 4, false, true, g6Var));
        } else {
            return super.x(viewGroup, i10);
        }
    }
}
