package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class uy extends org.telegram.ui.Components.l61 {
    public static final int f42540a = 0;

    static {
        org.telegram.ui.Components.l61.setup(new org.telegram.ui.Components.l61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.m61 m61Var, boolean z10, org.telegram.ui.Components.b71 b71Var, org.telegram.ui.Components.j71 j71Var) {
        vy vyVar = (vy) view;
        vyVar.f42857b.setOnClickListener((View.OnClickListener) m61Var.G);
        vyVar.e.setOnClickListener((View.OnClickListener) m61Var.H);
        vyVar.a(m61Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new vy(context, g6Var);
    }
}
