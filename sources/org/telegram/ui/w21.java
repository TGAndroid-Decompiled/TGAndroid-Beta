package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class w21 extends org.telegram.ui.Components.q31 {
    public static final int f50682b = 0;

    static {
        org.telegram.ui.Components.q31.h(new org.telegram.ui.Components.q31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z10, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.l41 l41Var) {
        ((x21) view).set(r31Var.f37640z);
    }

    @Override
    public final boolean c(org.telegram.ui.Components.r31 r31Var, org.telegram.ui.Components.r31 r31Var2) {
        if (r31Var.f37640z == r31Var2.f37640z) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new x21(context, e6Var);
    }

    @Override
    public final boolean e(org.telegram.ui.Components.r31 r31Var, org.telegram.ui.Components.r31 r31Var2) {
        if (r31Var.d == r31Var2.d) {
            return true;
        }
        return false;
    }
}
