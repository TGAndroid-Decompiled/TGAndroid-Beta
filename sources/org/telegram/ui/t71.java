package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class t71 extends org.telegram.ui.Components.e61 {
    public static final int f41603a = 0;

    static {
        org.telegram.ui.Components.e61.setup(new org.telegram.ui.Components.e61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.f61 f61Var, boolean z10, org.telegram.ui.Components.s61 s61Var, org.telegram.ui.Components.a71 a71Var) {
        ((u71) view).set(f61Var.f26153z);
    }

    @Override
    public final boolean contentsEquals(org.telegram.ui.Components.f61 f61Var, org.telegram.ui.Components.f61 f61Var2) {
        if (f61Var.f26153z == f61Var2.f26153z) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new u71(context, d6Var);
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.f61 f61Var, org.telegram.ui.Components.f61 f61Var2) {
        if (f61Var.d == f61Var2.d) {
            return true;
        }
        return false;
    }
}
