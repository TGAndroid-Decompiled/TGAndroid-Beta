package yh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
public final class d4 extends s61 {
    public final f4 N;

    public d4(f4 f4Var, im0 im0Var, Context context, int i10, t3 t3Var, d6 d6Var) {
        super(im0Var, context, i10, 0, false, t3Var, d6Var);
        this.N = f4Var;
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        d6 d6Var2;
        f4 f4Var = this.N;
        if (i10 == 0) {
            Context context = f4Var.getContext();
            int i11 = h6.L6;
            d6Var2 = ((org.telegram.ui.ActionBar.f3) f4Var).resourcesProvider;
            return new s4.b1(new org.telegram.ui.Cells.l4(context, i11, 13, 12, 4, false, false, d6Var2));
        } else if (i10 == 42) {
            Context context2 = f4Var.getContext();
            int i12 = h6.L6;
            d6Var = ((org.telegram.ui.ActionBar.f3) f4Var).resourcesProvider;
            return new s4.b1(new org.telegram.ui.Cells.l4(context2, i12, 13, 12, 4, false, true, d6Var));
        } else {
            return super.x(viewGroup, i10);
        }
    }
}
