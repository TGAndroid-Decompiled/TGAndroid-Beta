package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class z71 extends org.telegram.ui.Components.t61 {
    public static final int f46189a = 0;

    static {
        org.telegram.ui.Components.t61.setup(new org.telegram.ui.Components.t61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.u61 u61Var, boolean z10, org.telegram.ui.Components.k71 k71Var, org.telegram.ui.Components.s71 s71Var) {
        ((a81) view).set(u61Var.f33262z);
    }

    @Override
    public final boolean contentsEquals(org.telegram.ui.Components.u61 u61Var, org.telegram.ui.Components.u61 u61Var2) {
        if (u61Var.f33262z == u61Var2.f33262z) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new a81(context, u6Var);
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.u61 u61Var, org.telegram.ui.Components.u61 u61Var2) {
        if (u61Var.d == u61Var2.d) {
            return true;
        }
        return false;
    }
}
