package wh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.sl0;
public final class n4 extends g51 {
    public static final int f49927a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(android.view.View r2, org.telegram.ui.Components.h51 r3, boolean r4, org.telegram.ui.Components.w51 r5, org.telegram.ui.Components.h61 r6) {
        throw new UnsupportedOperationException("Method not decompiled: wh.n4.bindView(android.view.View, org.telegram.ui.Components.h51, boolean, org.telegram.ui.Components.w51, org.telegram.ui.Components.h61):void");
    }

    @Override
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        if (h51Var.d == h51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        o4 o4Var = new o4(context, g6Var);
        o4Var.setBackground(new w1(k6.v0(k6.f21661d6, g6Var)));
        return o4Var;
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        if (h51Var.d == h51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
