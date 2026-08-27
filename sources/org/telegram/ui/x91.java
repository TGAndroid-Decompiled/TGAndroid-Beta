package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;

public final class x91 extends org.telegram.ui.Components.m41 {

    public static final int f44359b = 0;

    public org.telegram.ui.Cells.n7 f44360a;

    static {
        org.telegram.ui.Components.m41.setup(new x91());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.zk0 zk0Var, View view, org.telegram.ui.Components.n41 n41Var) {
        ((org.telegram.ui.Cells.o7) view).l(n41Var.h, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.k51 k51Var) {
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        o7Var.k((MessageObject) n41Var.G, n41Var.v, false);
        o7Var.i(n41Var.f30838e, false);
        o7Var.l(n41Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        if (this.f44360a == null) {
            this.f44360a = new org.telegram.ui.Cells.n7(context, c6Var);
        }
        org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, this.f44360a, i10);
        o7Var.f24807s0 = true;
        o7Var.W = true;
        return o7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.n41 n41Var, org.telegram.ui.Components.n41 n41Var2) {
        return n41Var.f30849q == n41Var2.f30849q && n41Var.f30838e == n41Var2.f30838e && n41Var.B == n41Var2.B;
    }
}
