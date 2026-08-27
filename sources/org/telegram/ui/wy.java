package org.telegram.ui;

import android.content.Context;
import android.view.View;

public final class wy extends org.telegram.ui.Components.m41 {

    public static final int f44210a = 0;

    static {
        org.telegram.ui.Components.m41.setup(new wy());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.k51 k51Var) {
        xy xyVar = (xy) view;
        xyVar.f44639b.setOnClickListener((View.OnClickListener) n41Var.G);
        xyVar.f44641e.setOnClickListener((View.OnClickListener) n41Var.H);
        xyVar.a(n41Var.f30838e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new xy(context, c6Var);
    }
}
