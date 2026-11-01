package zf;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
import th.r4;
public final class z0 extends a51 {
    public static final int f55733b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        ((a1) view).a((r4) b51Var.G);
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        return new a1(context, p6Var);
    }
}
