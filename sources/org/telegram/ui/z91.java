package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class z91 extends org.telegram.ui.Components.k41 {
    public static final int f45093b = 0;
    public org.telegram.ui.Cells.q7 f45094a;

    static {
        org.telegram.ui.Components.k41.setup(new org.telegram.ui.Components.k41());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.wk0 wk0Var, View view, org.telegram.ui.Components.l41 l41Var) {
        ((org.telegram.ui.Cells.r7) view).l(l41Var.h, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.i51 i51Var) {
        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
        r7Var.k((MessageObject) l41Var.G, l41Var.v, false);
        r7Var.i(l41Var.f30333e, false);
        r7Var.l(l41Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        if (this.f45094a == null) {
            this.f45094a = new org.telegram.ui.Cells.q7(context, b6Var);
        }
        org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7(context, this.f45094a, i9);
        r7Var.f25115s0 = true;
        r7Var.W = true;
        return r7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.l41 l41Var, org.telegram.ui.Components.l41 l41Var2) {
        if (l41Var.f30344q == l41Var2.f30344q && l41Var.f30333e == l41Var2.f30333e && l41Var.B == l41Var2.B) {
            return true;
        }
        return false;
    }
}
