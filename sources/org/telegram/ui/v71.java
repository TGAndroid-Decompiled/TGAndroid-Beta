package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class v71 extends org.telegram.ui.Components.k61 {
    public static final int f42600a = 0;

    static {
        org.telegram.ui.Components.k61.setup(new org.telegram.ui.Components.k61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.l61 l61Var, boolean z10, org.telegram.ui.Components.a71 a71Var, org.telegram.ui.Components.i71 i71Var) {
        ((w71) view).set(l61Var.f28240z);
    }

    @Override
    public final boolean contentsEquals(org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.l61 l61Var2) {
        if (l61Var.f28240z == l61Var2.f28240z) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new w71(context, g6Var);
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.l61 l61Var2) {
        if (l61Var.d == l61Var2.d) {
            return true;
        }
        return false;
    }
}
