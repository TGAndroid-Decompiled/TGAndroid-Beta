package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.uk0;
public final class f extends a51 {
    public static final int f42829b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(android.view.View r27, org.telegram.ui.Components.b51 r28, boolean r29, org.telegram.ui.Components.q51 r30, org.telegram.ui.Components.v51 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.f.b(android.view.View, org.telegram.ui.Components.b51, boolean, org.telegram.ui.Components.q51, org.telegram.ui.Components.v51):void");
    }

    @Override
    public final boolean c(b51 b51Var, b51 b51Var2) {
        if (b51Var.H == b51Var2.H && TextUtils.equals(b51Var.f24644m, b51Var2.f24644m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        return new g(context, p6Var);
    }

    @Override
    public final boolean e(b51 b51Var, b51 b51Var2) {
        if (b51Var.H == b51Var2.H && TextUtils.isEmpty(b51Var.f24644m) == TextUtils.isEmpty(b51Var2.f24644m)) {
            return true;
        }
        return false;
    }
}
