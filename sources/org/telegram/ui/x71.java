package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class x71 extends org.telegram.ui.Components.s61 {
    public static final int f45686a = 0;

    static {
        org.telegram.ui.Components.s61.setup(new org.telegram.ui.Components.s61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.t61 t61Var, boolean z10, org.telegram.ui.Components.j71 j71Var, org.telegram.ui.Components.r71 r71Var) {
        ((y71) view).set(t61Var.f32885z);
    }

    @Override
    public final boolean contentsEquals(org.telegram.ui.Components.t61 t61Var, org.telegram.ui.Components.t61 t61Var2) {
        if (t61Var.f32885z == t61Var2.f32885z) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new y71(context, u6Var);
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.t61 t61Var, org.telegram.ui.Components.t61 t61Var2) {
        if (t61Var.d == t61Var2.d) {
            return true;
        }
        return false;
    }
}
