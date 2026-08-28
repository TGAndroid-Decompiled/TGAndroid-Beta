package qh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
public final class k4 extends k41 {
    public static final int f46490a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(android.view.View r2, org.telegram.ui.Components.l41 r3, boolean r4, org.telegram.ui.Components.z41 r5, org.telegram.ui.Components.i51 r6) {
        throw new UnsupportedOperationException("Method not decompiled: qh.k4.bindView(android.view.View, org.telegram.ui.Components.l41, boolean, org.telegram.ui.Components.z41, org.telegram.ui.Components.i51):void");
    }

    @Override
    public final boolean contentsEquals(l41 l41Var, l41 l41Var2) {
        if (l41Var.d == l41Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        l4 l4Var = new l4(context, b6Var);
        l4Var.setBackground(new u1(f6.v0(f6.f23001d6, b6Var)));
        return l4Var;
    }

    @Override
    public final boolean equals(l41 l41Var, l41 l41Var2) {
        if (l41Var.d == l41Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
