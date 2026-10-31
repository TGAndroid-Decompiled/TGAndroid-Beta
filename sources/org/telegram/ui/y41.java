package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class y41 extends org.telegram.ui.Components.z41 {
    public static final int f43706b = 0;

    static {
        org.telegram.ui.Components.z41.h(new org.telegram.ui.Components.z41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.a51 a51Var, boolean z10, org.telegram.ui.Components.p51 p51Var, org.telegram.ui.Components.u51 u51Var) {
        ((z41) view).set(a51Var.f24305z);
    }

    @Override
    public final boolean c(org.telegram.ui.Components.a51 a51Var, org.telegram.ui.Components.a51 a51Var2) {
        if (a51Var.f24305z == a51Var2.f24305z) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new z41(context, p6Var);
    }

    @Override
    public final boolean e(org.telegram.ui.Components.a51 a51Var, org.telegram.ui.Components.a51 a51Var2) {
        if (a51Var.d == a51Var2.d) {
            return true;
        }
        return false;
    }
}
