package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;
public final class g extends u51 {
    public static final int f39062a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(android.view.View r27, org.telegram.ui.Components.v51 r28, boolean r29, org.telegram.ui.Components.j61 r30, org.telegram.ui.Components.r61 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g.bindView(android.view.View, org.telegram.ui.Components.v51, boolean, org.telegram.ui.Components.j61, org.telegram.ui.Components.r61):void");
    }

    @Override
    public final boolean contentsEquals(v51 v51Var, v51 v51Var2) {
        if (v51Var.H == v51Var2.H && TextUtils.equals(v51Var.f29050m, v51Var2.f29050m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, d6 d6Var) {
        return new h(context, d6Var);
    }

    @Override
    public final boolean equals(v51 v51Var, v51 v51Var2) {
        if (v51Var.H == v51Var2.H && TextUtils.isEmpty(v51Var.f29050m) == TextUtils.isEmpty(v51Var2.f29050m)) {
            return true;
        }
        return false;
    }
}
