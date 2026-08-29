package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class vy extends org.telegram.ui.Components.v41 {
    public static final int f43797a = 0;

    static {
        org.telegram.ui.Components.v41.setup(new org.telegram.ui.Components.v41());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.w41 w41Var, boolean z10, org.telegram.ui.Components.k51 k51Var, org.telegram.ui.Components.u51 u51Var) {
        wy wyVar = (wy) view;
        wyVar.f44399b.setOnClickListener((View.OnClickListener) w41Var.G);
        wyVar.f44401e.setOnClickListener((View.OnClickListener) w41Var.H);
        wyVar.a(w41Var.f34294e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new wy(context, c6Var);
    }
}
