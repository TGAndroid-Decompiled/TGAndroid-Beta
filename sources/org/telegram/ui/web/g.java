package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
public final class g extends h51 {
    public static final int f38947a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(android.view.View r27, org.telegram.ui.Components.i51 r28, boolean r29, org.telegram.ui.Components.w51 r30, org.telegram.ui.Components.e61 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g.bindView(android.view.View, org.telegram.ui.Components.i51, boolean, org.telegram.ui.Components.w51, org.telegram.ui.Components.e61):void");
    }

    @Override
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        if (i51Var.H == i51Var2.H && TextUtils.equals(i51Var.f24895m, i51Var2.f24895m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, e6 e6Var) {
        return new h(context, e6Var);
    }

    @Override
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        if (i51Var.H == i51Var2.H && TextUtils.isEmpty(i51Var.f24895m) == TextUtils.isEmpty(i51Var2.f24895m)) {
            return true;
        }
        return false;
    }
}
