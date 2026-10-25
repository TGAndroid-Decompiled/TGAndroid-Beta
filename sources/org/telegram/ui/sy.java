package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class sy extends org.telegram.ui.Components.s61 {
    public static final int f43623a = 0;

    static {
        org.telegram.ui.Components.s61.setup(new org.telegram.ui.Components.s61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.t61 t61Var, boolean z10, org.telegram.ui.Components.j71 j71Var, org.telegram.ui.Components.r71 r71Var) {
        ty tyVar = (ty) view;
        tyVar.f43932b.setOnClickListener((View.OnClickListener) t61Var.G);
        tyVar.e.setOnClickListener((View.OnClickListener) t61Var.H);
        tyVar.a(t61Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new ty(context, u6Var);
    }
}
