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

public final class w extends m41 {

    public static final int f47524a = 0;

    static {
        m41.setup(new w());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        ((x) view).i((a) n41Var.G, (j3) n41Var.H);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        x xVar = new x(context, i10, c6Var);
        xVar.setBackground(new u1(g6.v0(g6.f23053d6, c6Var)));
        return xVar;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
