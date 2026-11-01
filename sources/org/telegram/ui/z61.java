package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class z61 extends org.telegram.ui.Components.a51 {
    public static final int f43836c = 0;
    public m.p3 f43837b;

    static {
        org.telegram.ui.Components.a51.h(new org.telegram.ui.Components.a51());
    }

    @Override
    public final void a(org.telegram.ui.Components.uk0 uk0Var, View view, org.telegram.ui.Components.b51 b51Var) {
        boolean z10;
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
        if (b51Var != null && b51Var.h) {
            z10 = true;
        } else {
            z10 = false;
        }
        s7Var.l(z10, false);
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.b51 b51Var, boolean z10, org.telegram.ui.Components.q51 q51Var, org.telegram.ui.Components.v51 v51Var) {
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
        s7Var.k((org.telegram.messenger.kj) b51Var.G, b51Var.v, false);
        s7Var.i(b51Var.e, false);
        s7Var.l(b51Var.h, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        if (this.f43837b == null) {
            this.f43837b = new m.p3(context, p6Var);
        }
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.f43837b, i10);
        s7Var.f23047w0 = true;
        s7Var.f23024d0 = true;
        return s7Var;
    }

    @Override
    public final boolean e(org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.b51 b51Var2) {
        if (b51Var.f24648q == b51Var2.f24648q && b51Var.e == b51Var2.e && b51Var.B == b51Var2.B) {
            return true;
        }
        return false;
    }
}
