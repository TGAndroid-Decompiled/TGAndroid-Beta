package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class sy extends org.telegram.ui.Components.f61 {
    public static final int f41546a = 0;

    static {
        org.telegram.ui.Components.f61.setup(new org.telegram.ui.Components.f61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.g61 g61Var, boolean z10, org.telegram.ui.Components.t61 t61Var, org.telegram.ui.Components.b71 b71Var) {
        ty tyVar = (ty) view;
        tyVar.f41776b.setOnClickListener((View.OnClickListener) g61Var.G);
        tyVar.e.setOnClickListener((View.OnClickListener) g61Var.H);
        tyVar.a(g61Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new ty(context, d6Var);
    }
}
