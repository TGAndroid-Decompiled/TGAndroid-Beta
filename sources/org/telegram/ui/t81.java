package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class t81 extends org.telegram.ui.Components.w51 {
    public static final int f37997a = 0;

    static {
        org.telegram.ui.Components.w51.setup(new org.telegram.ui.Components.w51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.x51 x51Var, boolean z10, org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.t61 t61Var) {
        ((u81) view).set(x51Var.f30305z);
    }

    @Override
    public final boolean contentsEquals(org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.x51 x51Var2) {
        if (x51Var.f30305z == x51Var2.f30305z) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new u81(context, d6Var);
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.x51 x51Var2) {
        if (x51Var.d == x51Var2.d) {
            return true;
        }
        return false;
    }
}
