package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class ua1 extends org.telegram.ui.Components.g51 {
    public static final int f41787b = 0;
    public org.telegram.ui.Cells.q7 f41788a;

    static {
        org.telegram.ui.Components.g51.setup(new org.telegram.ui.Components.g51());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.sl0 sl0Var, View view, org.telegram.ui.Components.h51 h51Var) {
        ((org.telegram.ui.Cells.r7) view).l(h51Var.h, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.h61 h61Var) {
        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
        r7Var.k((MessageObject) h51Var.G, h51Var.v, false);
        r7Var.i(h51Var.f27369e, false);
        r7Var.l(h51Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        if (this.f41788a == null) {
            this.f41788a = new org.telegram.ui.Cells.q7(context, g6Var);
        }
        org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7(context, this.f41788a, i10);
        r7Var.f23585t0 = true;
        r7Var.f23560a0 = true;
        return r7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.h51 h51Var, org.telegram.ui.Components.h51 h51Var2) {
        if (h51Var.f27380q == h51Var2.f27380q && h51Var.f27369e == h51Var2.f27369e && h51Var.B == h51Var2.B) {
            return true;
        }
        return false;
    }
}
