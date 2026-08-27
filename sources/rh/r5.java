package rh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class r5 extends m41 {

    public static final int f47413a = 0;

    static {
        m41.setup(new r5());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        ((t5) view).g((a) n41Var.G, (q5) n41Var.H, n41Var.f30850r);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        t5 t5Var = new t5(context, c6Var);
        t5Var.setBackground(new u1(g6.v0(g6.f23053d6, c6Var)));
        return t5Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
