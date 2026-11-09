package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class f extends x31 {
    public static final int f51106b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(android.view.View r27, org.telegram.ui.Components.y31 r28, boolean r29, org.telegram.ui.Components.m41 r30, org.telegram.ui.Components.r41 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.f.b(android.view.View, org.telegram.ui.Components.y31, boolean, org.telegram.ui.Components.m41, org.telegram.ui.Components.r41):void");
    }

    @Override
    public final boolean c(y31 y31Var, y31 y31Var2) {
        if (y31Var.H == y31Var2.H && TextUtils.equals(y31Var.f40569m, y31Var2.f40569m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        return new g(context, g6Var);
    }

    @Override
    public final boolean e(y31 y31Var, y31 y31Var2) {
        if (y31Var.H == y31Var2.H && TextUtils.isEmpty(y31Var.f40569m) == TextUtils.isEmpty(y31Var2.f40569m)) {
            return true;
        }
        return false;
    }
}
