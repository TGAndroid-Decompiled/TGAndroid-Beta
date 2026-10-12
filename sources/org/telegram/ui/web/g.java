package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
public final class g extends t61 {
    public static final int f43248a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(android.view.View r27, org.telegram.ui.Components.u61 r28, boolean r29, org.telegram.ui.Components.h71 r30, org.telegram.ui.Components.p71 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g.bindView(android.view.View, org.telegram.ui.Components.u61, boolean, org.telegram.ui.Components.h71, org.telegram.ui.Components.p71):void");
    }

    @Override
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        if (u61Var.H == u61Var2.H && TextUtils.equals(u61Var.f31072m, u61Var2.f31072m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, c6 c6Var) {
        return new h(context, c6Var);
    }

    @Override
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        if (u61Var.H == u61Var2.H && TextUtils.isEmpty(u61Var.f31072m) == TextUtils.isEmpty(u61Var2.f31072m)) {
            return true;
        }
        return false;
    }
}
