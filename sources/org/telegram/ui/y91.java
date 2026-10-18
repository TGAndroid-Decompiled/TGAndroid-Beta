package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class y91 extends org.telegram.ui.Components.e61 {
    public static final int f43356b = 0;
    public org.telegram.ui.Cells.r7 f43357a;

    static {
        org.telegram.ui.Components.e61.setup(new org.telegram.ui.Components.e61());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.im0 im0Var, View view, org.telegram.ui.Components.f61 f61Var) {
        boolean z10;
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
        if (f61Var != null && f61Var.h) {
            z10 = true;
        } else {
            z10 = false;
        }
        s7Var.l(z10, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.f61 f61Var, boolean z10, org.telegram.ui.Components.s61 s61Var, org.telegram.ui.Components.a71 a71Var) {
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
        s7Var.k((MessageObject) f61Var.G, f61Var.v, false);
        s7Var.i(f61Var.e, false);
        s7Var.l(f61Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        if (this.f43357a == null) {
            this.f43357a = new org.telegram.ui.Cells.r7(context, d6Var);
        }
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.f43357a, i10);
        s7Var.f23048w0 = true;
        s7Var.f23025d0 = true;
        return s7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.f61 f61Var, org.telegram.ui.Components.f61 f61Var2) {
        if (f61Var.f26145q == f61Var2.f26145q && f61Var.e == f61Var2.e && f61Var.B == f61Var2.B) {
            return true;
        }
        return false;
    }
}
