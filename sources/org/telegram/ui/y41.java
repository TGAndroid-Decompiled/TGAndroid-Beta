package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class y41 extends org.telegram.ui.Components.q31 {
    public static final int f52191c = 0;
    public m.o3 f52192b;

    static {
        org.telegram.ui.Components.q31.h(new org.telegram.ui.Components.q31());
    }

    @Override
    public final void a(org.telegram.ui.Components.tj0 tj0Var, View view, org.telegram.ui.Components.r31 r31Var) {
        boolean z10;
        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
        if (r31Var != null && r31Var.h) {
            z10 = true;
        } else {
            z10 = false;
        }
        n7Var.l(z10, false);
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z10, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.l41 l41Var) {
        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
        n7Var.k((org.telegram.messenger.zi) r31Var.G, r31Var.v, false);
        n7Var.i(r31Var.f37621e, false);
        n7Var.l(r31Var.h, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        if (this.f52192b == null) {
            this.f52192b = new m.o3(context, e6Var);
        }
        org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, this.f52192b, i3);
        n7Var.f29711x0 = true;
        n7Var.f29687e0 = true;
        return n7Var;
    }

    @Override
    public final boolean e(org.telegram.ui.Components.r31 r31Var, org.telegram.ui.Components.r31 r31Var2) {
        if (r31Var.f37632q == r31Var2.f37632q && r31Var.f37621e == r31Var2.f37621e && r31Var.B == r31Var2.B) {
            return true;
        }
        return false;
    }
}
