package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class r71 extends org.telegram.ui.Components.f61 {
    public static final int f41078a = 0;

    static {
        org.telegram.ui.Components.f61.setup(new org.telegram.ui.Components.f61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.g61 g61Var, boolean z10, org.telegram.ui.Components.t61 t61Var, org.telegram.ui.Components.b71 b71Var) {
        ((s71) view).set(g61Var.f26510z);
    }

    @Override
    public final boolean contentsEquals(org.telegram.ui.Components.g61 g61Var, org.telegram.ui.Components.g61 g61Var2) {
        if (g61Var.f26510z == g61Var2.f26510z) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new s71(context, d6Var);
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.g61 g61Var, org.telegram.ui.Components.g61 g61Var2) {
        if (g61Var.d == g61Var2.d) {
            return true;
        }
        return false;
    }
}
