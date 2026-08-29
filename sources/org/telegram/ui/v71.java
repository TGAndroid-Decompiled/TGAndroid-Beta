package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class v71 extends org.telegram.ui.Components.v41 {
    public static final int f43456a = 0;

    static {
        org.telegram.ui.Components.v41.setup(new org.telegram.ui.Components.v41());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.w41 w41Var, boolean z10, org.telegram.ui.Components.k51 k51Var, org.telegram.ui.Components.u51 u51Var) {
        ((w71) view).set(w41Var.f34313z);
    }

    @Override
    public final boolean contentsEquals(org.telegram.ui.Components.w41 w41Var, org.telegram.ui.Components.w41 w41Var2) {
        if (w41Var.f34313z == w41Var2.f34313z) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new w71(context, c6Var);
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.w41 w41Var, org.telegram.ui.Components.w41 w41Var2) {
        if (w41Var.d == w41Var2.d) {
            return true;
        }
        return false;
    }
}
