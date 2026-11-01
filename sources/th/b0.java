package th;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class b0 extends a51 {
    public static final int f48808b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        ((c0) view).set((h0) b51Var.G);
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        c0 c0Var = new c0(i10, context, false);
        c0Var.setLayoutParams(new s4.o0(-2, -2));
        return c0Var;
    }

    @Override
    public final boolean e(b51 b51Var, b51 b51Var2) {
        if (b51Var.G == b51Var2.G) {
            return true;
        }
        return false;
    }
}
