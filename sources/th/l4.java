package th;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class l4 extends v41 {
    public static final int f48560a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(android.view.View r2, org.telegram.ui.Components.w41 r3, boolean r4, org.telegram.ui.Components.k51 r5, org.telegram.ui.Components.u51 r6) {
        throw new UnsupportedOperationException("Method not decompiled: th.l4.bindView(android.view.View, org.telegram.ui.Components.w41, boolean, org.telegram.ui.Components.k51, org.telegram.ui.Components.u51):void");
    }

    @Override
    public final boolean contentsEquals(w41 w41Var, w41 w41Var2) {
        if (w41Var.d == w41Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        m4 m4Var = new m4(context, c6Var);
        m4Var.setBackground(new u1(g6.v0(g6.f23062d6, c6Var)));
        return m4Var;
    }

    @Override
    public final boolean equals(w41 w41Var, w41 w41Var2) {
        if (w41Var.d == w41Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
