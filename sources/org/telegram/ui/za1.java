package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class za1 extends org.telegram.ui.Components.x51 {
    public static final int f40541b = 0;
    public org.telegram.ui.Cells.s7 f40542a;

    static {
        org.telegram.ui.Components.x51.setup(new org.telegram.ui.Components.x51());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.zl0 zl0Var, View view, org.telegram.ui.Components.y51 y51Var) {
        ((org.telegram.ui.Cells.t7) view).l(y51Var.h, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.y51 y51Var, boolean z10, org.telegram.ui.Components.m61 m61Var, org.telegram.ui.Components.u61 u61Var) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        t7Var.k((MessageObject) y51Var.G, y51Var.v, false);
        t7Var.i(y51Var.e, false);
        t7Var.l(y51Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        if (this.f40542a == null) {
            this.f40542a = new org.telegram.ui.Cells.s7(context, d6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.f40542a, i10);
        t7Var.f21261w0 = true;
        t7Var.f21238d0 = true;
        return t7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.y51 y51Var, org.telegram.ui.Components.y51 y51Var2) {
        if (y51Var.f30642q == y51Var2.f30642q && y51Var.e == y51Var2.e && y51Var.B == y51Var2.B) {
            return true;
        }
        return false;
    }
}
