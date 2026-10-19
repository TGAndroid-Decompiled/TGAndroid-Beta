package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class w91 extends org.telegram.ui.Components.f61 {
    public static final int f42514b = 0;
    public org.telegram.ui.Cells.r7 f42515a;

    static {
        org.telegram.ui.Components.f61.setup(new org.telegram.ui.Components.f61());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.im0 im0Var, View view, org.telegram.ui.Components.g61 g61Var) {
        boolean z10;
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
        if (g61Var != null && g61Var.h) {
            z10 = true;
        } else {
            z10 = false;
        }
        s7Var.l(z10, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.g61 g61Var, boolean z10, org.telegram.ui.Components.t61 t61Var, org.telegram.ui.Components.b71 b71Var) {
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
        s7Var.k((MessageObject) g61Var.G, g61Var.v, false);
        s7Var.i(g61Var.e, false);
        s7Var.l(g61Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        if (this.f42515a == null) {
            this.f42515a = new org.telegram.ui.Cells.r7(context, d6Var);
        }
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.f42515a, i10);
        s7Var.f23049w0 = true;
        s7Var.f23026d0 = true;
        return s7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.g61 g61Var, org.telegram.ui.Components.g61 g61Var2) {
        if (g61Var.f26502q == g61Var2.f26502q && g61Var.e == g61Var2.e && g61Var.B == g61Var2.B) {
            return true;
        }
        return false;
    }
}
