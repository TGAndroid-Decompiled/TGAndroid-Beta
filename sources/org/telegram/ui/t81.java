package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class t81 extends org.telegram.ui.Components.x51 {
    public static final int f38105a = 0;

    static {
        org.telegram.ui.Components.x51.setup(new org.telegram.ui.Components.x51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.y51 y51Var, boolean z10, org.telegram.ui.Components.m61 m61Var, org.telegram.ui.Components.u61 u61Var) {
        ((u81) view).set(y51Var.f30650z);
    }

    @Override
    public final boolean contentsEquals(org.telegram.ui.Components.y51 y51Var, org.telegram.ui.Components.y51 y51Var2) {
        if (y51Var.f30650z == y51Var2.f30650z) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new u81(context, d6Var);
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.y51 y51Var, org.telegram.ui.Components.y51 y51Var2) {
        if (y51Var.d == y51Var2.d) {
            return true;
        }
        return false;
    }
}
