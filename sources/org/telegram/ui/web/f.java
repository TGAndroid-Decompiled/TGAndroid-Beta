package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class f extends w31 {
    public static final int f51118b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(android.view.View r27, org.telegram.ui.Components.x31 r28, boolean r29, org.telegram.ui.Components.l41 r30, org.telegram.ui.Components.q41 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.f.b(android.view.View, org.telegram.ui.Components.x31, boolean, org.telegram.ui.Components.l41, org.telegram.ui.Components.q41):void");
    }

    @Override
    public final boolean c(x31 x31Var, x31 x31Var2) {
        if (x31Var.H == x31Var2.H && TextUtils.equals(x31Var.f40160m, x31Var2.f40160m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new g(context, f6Var);
    }

    @Override
    public final boolean e(x31 x31Var, x31 x31Var2) {
        if (x31Var.H == x31Var2.H && TextUtils.isEmpty(x31Var.f40160m) == TextUtils.isEmpty(x31Var2.f40160m)) {
            return true;
        }
        return false;
    }
}
