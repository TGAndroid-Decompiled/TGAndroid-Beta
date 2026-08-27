package org.telegram.ui;

import android.content.Context;
import android.view.View;

public final class r71 extends org.telegram.ui.Components.m41 {

    public static final int f41832a = 0;

    static {
        org.telegram.ui.Components.m41.setup(new r71());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.k51 k51Var) {
        ((s71) view).set(n41Var.f30857z);
    }

    @Override
    public final boolean contentsEquals(org.telegram.ui.Components.n41 n41Var, org.telegram.ui.Components.n41 n41Var2) {
        return n41Var.f30857z == n41Var2.f30857z;
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new s71(context, c6Var);
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.n41 n41Var, org.telegram.ui.Components.n41 n41Var2) {
        return n41Var.d == n41Var2.d;
    }
}
