package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class za1 extends org.telegram.ui.Components.v51 {
    public static final int f40430b = 0;
    public org.telegram.ui.Cells.s7 f40431a;

    static {
        org.telegram.ui.Components.v51.setup(new org.telegram.ui.Components.v51());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.xl0 xl0Var, View view, org.telegram.ui.Components.w51 w51Var) {
        ((org.telegram.ui.Cells.t7) view).l(w51Var.h, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.w51 w51Var, boolean z10, org.telegram.ui.Components.k61 k61Var, org.telegram.ui.Components.s61 s61Var) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        t7Var.k((MessageObject) w51Var.G, w51Var.v, false);
        t7Var.i(w51Var.e, false);
        t7Var.l(w51Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.xl0 xl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        if (this.f40431a == null) {
            this.f40431a = new org.telegram.ui.Cells.s7(context, d6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.f40431a, i10);
        t7Var.f21239w0 = true;
        t7Var.f21216d0 = true;
        return t7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.w51 w51Var2) {
        if (w51Var.f29900q == w51Var2.f29900q && w51Var.e == w51Var2.e && w51Var.B == w51Var2.B) {
            return true;
        }
        return false;
    }
}
