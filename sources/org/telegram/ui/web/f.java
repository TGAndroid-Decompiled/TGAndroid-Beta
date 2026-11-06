package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
public final class f extends v31 {
    public static final int f51127b = 0;

    static {
        v31.h(new v31());
    }

    @Override
    public final void b(android.view.View r27, org.telegram.ui.Components.w31 r28, boolean r29, org.telegram.ui.Components.k41 r30, org.telegram.ui.Components.p41 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.f.b(android.view.View, org.telegram.ui.Components.w31, boolean, org.telegram.ui.Components.k41, org.telegram.ui.Components.p41):void");
    }

    @Override
    public final boolean c(w31 w31Var, w31 w31Var2) {
        if (w31Var.H == w31Var2.H && TextUtils.equals(w31Var.f39831m, w31Var2.f39831m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new g(context, f6Var);
    }

    @Override
    public final boolean e(w31 w31Var, w31 w31Var2) {
        if (w31Var.H == w31Var2.H && TextUtils.isEmpty(w31Var.f39831m) == TextUtils.isEmpty(w31Var2.f39831m)) {
            return true;
        }
        return false;
    }
}
