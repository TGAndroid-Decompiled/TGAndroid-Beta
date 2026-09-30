package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.zl0;
public final class g extends x51 {
    public static final int f39150a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(android.view.View r27, org.telegram.ui.Components.y51 r28, boolean r29, org.telegram.ui.Components.m61 r30, org.telegram.ui.Components.u61 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g.bindView(android.view.View, org.telegram.ui.Components.y51, boolean, org.telegram.ui.Components.m61, org.telegram.ui.Components.u61):void");
    }

    @Override
    public final boolean contentsEquals(y51 y51Var, y51 y51Var2) {
        if (y51Var.H == y51Var2.H && TextUtils.equals(y51Var.f30638m, y51Var2.f30638m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new h(context, d6Var);
    }

    @Override
    public final boolean equals(y51 y51Var, y51 y51Var2) {
        if (y51Var.H == y51Var2.H && TextUtils.isEmpty(y51Var.f30638m) == TextUtils.isEmpty(y51Var2.f30638m)) {
            return true;
        }
        return false;
    }
}
