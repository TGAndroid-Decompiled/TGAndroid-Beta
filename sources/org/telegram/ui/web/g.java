package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.uj0;
public final class g extends a41 {
    public static final int f52608b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(android.view.View r27, org.telegram.ui.Components.b41 r28, boolean r29, org.telegram.ui.Components.p41 r30, org.telegram.ui.Components.u41 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g.b(android.view.View, org.telegram.ui.Components.b41, boolean, org.telegram.ui.Components.p41, org.telegram.ui.Components.u41):void");
    }

    @Override
    public final boolean c(b41 b41Var, b41 b41Var2) {
        if (b41Var.H == b41Var2.H && TextUtils.equals(b41Var.f33182m, b41Var2.f33182m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        return new h(context, e6Var);
    }

    @Override
    public final boolean e(b41 b41Var, b41 b41Var2) {
        if (b41Var.H == b41Var2.H && TextUtils.isEmpty(b41Var.f33182m) == TextUtils.isEmpty(b41Var2.f33182m)) {
            return true;
        }
        return false;
    }
}
