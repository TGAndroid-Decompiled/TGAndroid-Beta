package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
public final class g extends h51 {
    public static final int f39501a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(android.view.View r27, org.telegram.ui.Components.i51 r28, boolean r29, org.telegram.ui.Components.w51 r30, org.telegram.ui.Components.g61 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g.bindView(android.view.View, org.telegram.ui.Components.i51, boolean, org.telegram.ui.Components.w51, org.telegram.ui.Components.g61):void");
    }

    @Override
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        if (i51Var.H == i51Var2.H && TextUtils.equals(i51Var.f25566m, i51Var2.f25566m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, f6 f6Var) {
        return new h(context, f6Var);
    }

    @Override
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        if (i51Var.H == i51Var2.H && TextUtils.isEmpty(i51Var.f25566m) == TextUtils.isEmpty(i51Var2.f25566m)) {
            return true;
        }
        return false;
    }
}
