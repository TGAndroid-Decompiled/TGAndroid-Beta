package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.z41;
public final class f extends z41 {
    public static final int f43027b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(android.view.View r27, org.telegram.ui.Components.a51 r28, boolean r29, org.telegram.ui.Components.p51 r30, org.telegram.ui.Components.u51 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.f.b(android.view.View, org.telegram.ui.Components.a51, boolean, org.telegram.ui.Components.p51, org.telegram.ui.Components.u51):void");
    }

    @Override
    public final boolean c(a51 a51Var, a51 a51Var2) {
        if (a51Var.H == a51Var2.H && TextUtils.equals(a51Var.f24293m, a51Var2.f24293m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        return new g(context, p6Var);
    }

    @Override
    public final boolean e(a51 a51Var, a51 a51Var2) {
        if (a51Var.H == a51Var2.H && TextUtils.isEmpty(a51Var.f24293m) == TextUtils.isEmpty(a51Var2.f24293m)) {
            return true;
        }
        return false;
    }
}
