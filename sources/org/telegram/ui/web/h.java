package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class h extends v41 {
    public static final int f44044a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(android.view.View r27, org.telegram.ui.Components.w41 r28, boolean r29, org.telegram.ui.Components.k51 r30, org.telegram.ui.Components.u51 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.h.bindView(android.view.View, org.telegram.ui.Components.w41, boolean, org.telegram.ui.Components.k51, org.telegram.ui.Components.u51):void");
    }

    @Override
    public final boolean contentsEquals(w41 w41Var, w41 w41Var2) {
        if (w41Var.H == w41Var2.H && TextUtils.equals(w41Var.f34301m, w41Var2.f34301m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        return new i(context, c6Var);
    }

    @Override
    public final boolean equals(w41 w41Var, w41 w41Var2) {
        if (w41Var.H == w41Var2.H && TextUtils.isEmpty(w41Var.f34301m) == TextUtils.isEmpty(w41Var2.f34301m)) {
            return true;
        }
        return false;
    }
}
