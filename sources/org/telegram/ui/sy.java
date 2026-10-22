package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class sy extends org.telegram.ui.Components.g61 {
    public static final int f41554a = 0;

    static {
        org.telegram.ui.Components.g61.setup(new org.telegram.ui.Components.g61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h61 h61Var, boolean z10, org.telegram.ui.Components.u61 u61Var, org.telegram.ui.Components.c71 c71Var) {
        ty tyVar = (ty) view;
        tyVar.f41769b.setOnClickListener((View.OnClickListener) h61Var.G);
        tyVar.e.setOnClickListener((View.OnClickListener) h61Var.H);
        tyVar.a(h61Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new ty(context, d6Var);
    }
}
