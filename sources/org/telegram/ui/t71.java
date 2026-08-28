package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class t71 extends org.telegram.ui.Components.k41 {
    public static final int f42885a = 0;

    static {
        org.telegram.ui.Components.k41.setup(new org.telegram.ui.Components.k41());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.i51 i51Var) {
        ((u71) view).set(l41Var.f30352z);
    }

    @Override
    public final boolean contentsEquals(org.telegram.ui.Components.l41 l41Var, org.telegram.ui.Components.l41 l41Var2) {
        if (l41Var.f30352z == l41Var2.f30352z) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new u71(context, b6Var);
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.l41 l41Var, org.telegram.ui.Components.l41 l41Var2) {
        if (l41Var.d == l41Var2.d) {
            return true;
        }
        return false;
    }
}
