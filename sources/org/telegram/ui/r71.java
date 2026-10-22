package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class r71 extends org.telegram.ui.Components.g61 {
    public static final int f41087a = 0;

    static {
        org.telegram.ui.Components.g61.setup(new org.telegram.ui.Components.g61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h61 h61Var, boolean z10, org.telegram.ui.Components.u61 u61Var, org.telegram.ui.Components.c71 c71Var) {
        ((s71) view).set(h61Var.f26798z);
    }

    @Override
    public final boolean contentsEquals(org.telegram.ui.Components.h61 h61Var, org.telegram.ui.Components.h61 h61Var2) {
        if (h61Var.f26798z == h61Var2.f26798z) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new s71(context, d6Var);
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.h61 h61Var, org.telegram.ui.Components.h61 h61Var2) {
        if (h61Var.d == h61Var2.d) {
            return true;
        }
        return false;
    }
}
