package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
public final class f extends q31 {
    public static final int f51113b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(android.view.View r27, org.telegram.ui.Components.r31 r28, boolean r29, org.telegram.ui.Components.f41 r30, org.telegram.ui.Components.k41 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.f.b(android.view.View, org.telegram.ui.Components.r31, boolean, org.telegram.ui.Components.f41, org.telegram.ui.Components.k41):void");
    }

    @Override
    public final boolean c(r31 r31Var, r31 r31Var2) {
        if (r31Var.H == r31Var2.H && TextUtils.equals(r31Var.f37599m, r31Var2.f37599m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new g(context, f6Var);
    }

    @Override
    public final boolean e(r31 r31Var, r31 r31Var2) {
        if (r31Var.H == r31Var2.H && TextUtils.isEmpty(r31Var.f37599m) == TextUtils.isEmpty(r31Var2.f37599m)) {
            return true;
        }
        return false;
    }
}
