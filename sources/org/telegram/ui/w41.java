package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class w41 extends org.telegram.ui.Components.a51 {
    public static final int f42672b = 0;

    static {
        org.telegram.ui.Components.a51.h(new org.telegram.ui.Components.a51());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.b51 b51Var, boolean z10, org.telegram.ui.Components.q51 q51Var, org.telegram.ui.Components.v51 v51Var) {
        ((x41) view).set(b51Var.f24656z);
    }

    @Override
    public final boolean c(org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.b51 b51Var2) {
        if (b51Var.f24656z == b51Var2.f24656z) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new x41(context, p6Var);
    }

    @Override
    public final boolean e(org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.b51 b51Var2) {
        if (b51Var.d == b51Var2.d) {
            return true;
        }
        return false;
    }
}
