package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
public final class h extends k61 {
    public static final int f43120a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(android.view.View r27, org.telegram.ui.Components.l61 r28, boolean r29, org.telegram.ui.Components.a71 r30, org.telegram.ui.Components.i71 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.h.bindView(android.view.View, org.telegram.ui.Components.l61, boolean, org.telegram.ui.Components.a71, org.telegram.ui.Components.i71):void");
    }

    @Override
    public final boolean contentsEquals(l61 l61Var, l61 l61Var2) {
        if (l61Var.H == l61Var2.H && TextUtils.equals(l61Var.f28228m, l61Var2.f28228m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, g6 g6Var) {
        return new i(context, g6Var);
    }

    @Override
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        if (l61Var.H == l61Var2.H && TextUtils.isEmpty(l61Var.f28228m) == TextUtils.isEmpty(l61Var2.f28228m)) {
            return true;
        }
        return false;
    }
}
