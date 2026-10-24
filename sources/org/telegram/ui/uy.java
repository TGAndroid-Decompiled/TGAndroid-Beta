package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class uy extends org.telegram.ui.Components.k61 {
    public static final int f42510a = 0;

    static {
        org.telegram.ui.Components.k61.setup(new org.telegram.ui.Components.k61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.l61 l61Var, boolean z10, org.telegram.ui.Components.a71 a71Var, org.telegram.ui.Components.i71 i71Var) {
        vy vyVar = (vy) view;
        vyVar.f42839b.setOnClickListener((View.OnClickListener) l61Var.G);
        vyVar.e.setOnClickListener((View.OnClickListener) l61Var.H);
        vyVar.a(l61Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new vy(context, g6Var);
    }
}
