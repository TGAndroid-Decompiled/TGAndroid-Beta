package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
public final class h extends g51 {
    public static final int f42127a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(android.view.View r27, org.telegram.ui.Components.h51 r28, boolean r29, org.telegram.ui.Components.v51 r30, org.telegram.ui.Components.d61 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.h.bindView(android.view.View, org.telegram.ui.Components.h51, boolean, org.telegram.ui.Components.v51, org.telegram.ui.Components.d61):void");
    }

    @Override
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        if (h51Var.H == h51Var2.H && TextUtils.equals(h51Var.f26622m, h51Var2.f26622m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, f6 f6Var) {
        return new i(context, f6Var);
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        if (h51Var.H == h51Var2.H && TextUtils.isEmpty(h51Var.f26622m) == TextUtils.isEmpty(h51Var2.f26622m)) {
            return true;
        }
        return false;
    }
}
