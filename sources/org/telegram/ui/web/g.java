package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
public final class g extends i51 {
    public static final int f42552a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(android.view.View r27, org.telegram.ui.Components.j51 r28, boolean r29, org.telegram.ui.Components.x51 r30, org.telegram.ui.Components.i61 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g.bindView(android.view.View, org.telegram.ui.Components.j51, boolean, org.telegram.ui.Components.x51, org.telegram.ui.Components.i61):void");
    }

    @Override
    public final boolean contentsEquals(j51 j51Var, j51 j51Var2) {
        if (j51Var.H == j51Var2.H && TextUtils.equals(j51Var.f28015m, j51Var2.f28015m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, g6 g6Var) {
        return new h(context, g6Var);
    }

    @Override
    public final boolean equals(j51 j51Var, j51 j51Var2) {
        if (j51Var.H == j51Var2.H && TextUtils.isEmpty(j51Var.f28015m) == TextUtils.isEmpty(j51Var2.f28015m)) {
            return true;
        }
        return false;
    }
}
