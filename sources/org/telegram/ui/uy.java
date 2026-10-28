package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class uy extends org.telegram.ui.Components.t61 {
    public static final int f44140a = 0;

    static {
        org.telegram.ui.Components.t61.setup(new org.telegram.ui.Components.t61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.u61 u61Var, boolean z10, org.telegram.ui.Components.k71 k71Var, org.telegram.ui.Components.s71 s71Var) {
        vy vyVar = (vy) view;
        vyVar.f44441b.setOnClickListener((View.OnClickListener) u61Var.G);
        vyVar.e.setOnClickListener((View.OnClickListener) u61Var.H);
        vyVar.a(u61Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new vy(context, u6Var);
    }
}
