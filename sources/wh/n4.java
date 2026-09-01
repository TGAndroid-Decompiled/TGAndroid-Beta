package wh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
public final class n4 extends i51 {
    public static final int f49891a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(android.view.View r2, org.telegram.ui.Components.j51 r3, boolean r4, org.telegram.ui.Components.x51 r5, org.telegram.ui.Components.i61 r6) {
        throw new UnsupportedOperationException("Method not decompiled: wh.n4.bindView(android.view.View, org.telegram.ui.Components.j51, boolean, org.telegram.ui.Components.x51, org.telegram.ui.Components.i61):void");
    }

    @Override
    public final boolean contentsEquals(j51 j51Var, j51 j51Var2) {
        if (j51Var.d == j51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, g6 g6Var) {
        o4 o4Var = new o4(context, g6Var);
        o4Var.setBackground(new w1(k6.v0(k6.f21659d6, g6Var)));
        return o4Var;
    }

    @Override
    public final boolean equals(j51 j51Var, j51 j51Var2) {
        if (j51Var.d == j51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
