package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class za1 extends org.telegram.ui.Components.w51 {
    public static final int f40431b = 0;
    public org.telegram.ui.Cells.s7 f40432a;

    static {
        org.telegram.ui.Components.w51.setup(new org.telegram.ui.Components.w51());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.yl0 yl0Var, View view, org.telegram.ui.Components.x51 x51Var) {
        ((org.telegram.ui.Cells.t7) view).l(x51Var.h, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.x51 x51Var, boolean z10, org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.t61 t61Var) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        t7Var.k((MessageObject) x51Var.G, x51Var.v, false);
        t7Var.i(x51Var.e, false);
        t7Var.l(x51Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        if (this.f40432a == null) {
            this.f40432a = new org.telegram.ui.Cells.s7(context, d6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.f40432a, i10);
        t7Var.f21241w0 = true;
        t7Var.f21218d0 = true;
        return t7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.x51 x51Var2) {
        if (x51Var.f30283q == x51Var2.f30283q && x51Var.e == x51Var2.e && x51Var.B == x51Var2.B) {
            return true;
        }
        return false;
    }
}
