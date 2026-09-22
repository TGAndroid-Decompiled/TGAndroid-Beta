package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;
public final class g extends x51 {
    public static final int f38924a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(android.view.View r27, org.telegram.ui.Components.y51 r28, boolean r29, org.telegram.ui.Components.m61 r30, org.telegram.ui.Components.u61 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g.bindView(android.view.View, org.telegram.ui.Components.y51, boolean, org.telegram.ui.Components.m61, org.telegram.ui.Components.u61):void");
    }

    @Override
    public final boolean contentsEquals(y51 y51Var, y51 y51Var2) {
        if (y51Var.H == y51Var2.H && TextUtils.equals(y51Var.f30519m, y51Var2.f30519m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, f6 f6Var) {
        return new h(context, f6Var);
    }

    @Override
    public final boolean equals(y51 y51Var, y51 y51Var2) {
        if (y51Var.H == y51Var2.H && TextUtils.isEmpty(y51Var.f30519m) == TextUtils.isEmpty(y51Var2.f30519m)) {
            return true;
        }
        return false;
    }
}
