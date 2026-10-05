package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class s81 extends org.telegram.ui.Components.g61 {
    public static final int f40381a = 0;

    static {
        org.telegram.ui.Components.g61.setup(new org.telegram.ui.Components.g61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h61 h61Var, boolean z10, org.telegram.ui.Components.w61 w61Var, org.telegram.ui.Components.e71 e71Var) {
        ((t81) view).set(h61Var.f27106z);
    }

    @Override
    public final boolean contentsEquals(org.telegram.ui.Components.h61 h61Var, org.telegram.ui.Components.h61 h61Var2) {
        if (h61Var.f27106z == h61Var2.f27106z) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new t81(context, d6Var);
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.h61 h61Var, org.telegram.ui.Components.h61 h61Var2) {
        if (h61Var.d == h61Var2.d) {
            return true;
        }
        return false;
    }
}
