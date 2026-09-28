package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;
public final class g extends w51 {
    public static final int f39062a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(android.view.View r27, org.telegram.ui.Components.x51 r28, boolean r29, org.telegram.ui.Components.l61 r30, org.telegram.ui.Components.t61 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g.bindView(android.view.View, org.telegram.ui.Components.x51, boolean, org.telegram.ui.Components.l61, org.telegram.ui.Components.t61):void");
    }

    @Override
    public final boolean contentsEquals(x51 x51Var, x51 x51Var2) {
        if (x51Var.H == x51Var2.H && TextUtils.equals(x51Var.f30294m, x51Var2.f30294m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, d6 d6Var) {
        return new h(context, d6Var);
    }

    @Override
    public final boolean equals(x51 x51Var, x51 x51Var2) {
        if (x51Var.H == x51Var2.H && TextUtils.isEmpty(x51Var.f30294m) == TextUtils.isEmpty(x51Var2.f30294m)) {
            return true;
        }
        return false;
    }
}
