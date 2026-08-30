package vh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
public final class n4 extends h51 {
    public static final int f46027a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(android.view.View r2, org.telegram.ui.Components.i51 r3, boolean r4, org.telegram.ui.Components.w51 r5, org.telegram.ui.Components.g61 r6) {
        throw new UnsupportedOperationException("Method not decompiled: vh.n4.bindView(android.view.View, org.telegram.ui.Components.i51, boolean, org.telegram.ui.Components.w51, org.telegram.ui.Components.g61):void");
    }

    @Override
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        if (i51Var.d == i51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, f6 f6Var) {
        o4 o4Var = new o4(context, f6Var);
        o4Var.setBackground(new v1(j6.v0(j6.f19906d6, f6Var)));
        return o4Var;
    }

    @Override
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        if (i51Var.d == i51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
