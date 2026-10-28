package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class h extends t61 {
    public static final int f44766a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(android.view.View r27, org.telegram.ui.Components.u61 r28, boolean r29, org.telegram.ui.Components.k71 r30, org.telegram.ui.Components.s71 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.h.bindView(android.view.View, org.telegram.ui.Components.u61, boolean, org.telegram.ui.Components.k71, org.telegram.ui.Components.s71):void");
    }

    @Override
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        if (u61Var.H == u61Var2.H && TextUtils.equals(u61Var.f33250m, u61Var2.f33250m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new i(context, u6Var);
    }

    @Override
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        if (u61Var.H == u61Var2.H && TextUtils.isEmpty(u61Var.f33250m) == TextUtils.isEmpty(u61Var2.f33250m)) {
            return true;
        }
        return false;
    }
}
