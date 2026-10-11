package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
public final class g extends q61 {
    public static final int f43493a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(android.view.View r27, org.telegram.ui.Components.r61 r28, boolean r29, org.telegram.ui.Components.e71 r30, org.telegram.ui.Components.m71 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g.bindView(android.view.View, org.telegram.ui.Components.r61, boolean, org.telegram.ui.Components.e71, org.telegram.ui.Components.m71):void");
    }

    @Override
    public final boolean contentsEquals(r61 r61Var, r61 r61Var2) {
        if (r61Var.H == r61Var2.H && TextUtils.equals(r61Var.f30362m, r61Var2.f30362m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, d6 d6Var) {
        return new h(context, d6Var);
    }

    @Override
    public final boolean equals(r61 r61Var, r61 r61Var2) {
        if (r61Var.H == r61Var2.H && TextUtils.isEmpty(r61Var.f30362m) == TextUtils.isEmpty(r61Var2.f30362m)) {
            return true;
        }
        return false;
    }
}
