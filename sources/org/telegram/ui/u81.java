package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class u81 extends org.telegram.ui.Components.f61 {
    public static final int f41119a = 0;

    static {
        org.telegram.ui.Components.f61.setup(new org.telegram.ui.Components.f61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.g61 g61Var, boolean z10, org.telegram.ui.Components.u61 u61Var, org.telegram.ui.Components.c71 c71Var) {
        ((v81) view).set(g61Var.f26687z);
    }

    @Override
    public final boolean contentsEquals(org.telegram.ui.Components.g61 g61Var, org.telegram.ui.Components.g61 g61Var2) {
        if (g61Var.f26687z == g61Var2.f26687z) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new v81(context, d6Var);
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.g61 g61Var, org.telegram.ui.Components.g61 g61Var2) {
        if (g61Var.d == g61Var2.d) {
            return true;
        }
        return false;
    }
}
