package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class w91 extends org.telegram.ui.Components.g61 {
    public static final int f42523b = 0;
    public org.telegram.ui.Cells.r7 f42524a;

    static {
        org.telegram.ui.Components.g61.setup(new org.telegram.ui.Components.g61());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.jm0 jm0Var, View view, org.telegram.ui.Components.h61 h61Var) {
        boolean z10;
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
        if (h61Var != null && h61Var.h) {
            z10 = true;
        } else {
            z10 = false;
        }
        s7Var.l(z10, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h61 h61Var, boolean z10, org.telegram.ui.Components.u61 u61Var, org.telegram.ui.Components.c71 c71Var) {
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
        s7Var.k((MessageObject) h61Var.G, h61Var.v, false);
        s7Var.i(h61Var.e, false);
        s7Var.l(h61Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        if (this.f42524a == null) {
            this.f42524a = new org.telegram.ui.Cells.r7(context, d6Var);
        }
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.f42524a, i10);
        s7Var.f23055w0 = true;
        s7Var.f23032d0 = true;
        return s7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.h61 h61Var, org.telegram.ui.Components.h61 h61Var2) {
        if (h61Var.f26790q == h61Var2.f26790q && h61Var.e == h61Var2.e && h61Var.B == h61Var2.B) {
            return true;
        }
        return false;
    }
}
