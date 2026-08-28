package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class ty extends org.telegram.ui.Components.k41 {
    public static final int f43084a = 0;

    static {
        org.telegram.ui.Components.k41.setup(new org.telegram.ui.Components.k41());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.i51 i51Var) {
        uy uyVar = (uy) view;
        uyVar.f43335b.setOnClickListener((View.OnClickListener) l41Var.G);
        uyVar.f43337e.setOnClickListener((View.OnClickListener) l41Var.H);
        uyVar.a(l41Var.f30333e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new uy(context, b6Var);
    }
}
