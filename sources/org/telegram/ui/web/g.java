package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
public final class g extends k61 {
    public static final int f41356a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(android.view.View r27, org.telegram.ui.Components.l61 r28, boolean r29, org.telegram.ui.Components.z61 r30, org.telegram.ui.Components.h71 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g.bindView(android.view.View, org.telegram.ui.Components.l61, boolean, org.telegram.ui.Components.z61, org.telegram.ui.Components.h71):void");
    }

    @Override
    public final boolean contentsEquals(l61 l61Var, l61 l61Var2) {
        if (l61Var.H == l61Var2.H && TextUtils.equals(l61Var.f26955m, l61Var2.f26955m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new h(context, c6Var);
    }

    @Override
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        if (l61Var.H == l61Var2.H && TextUtils.isEmpty(l61Var.f26955m) == TextUtils.isEmpty(l61Var2.f26955m)) {
            return true;
        }
        return false;
    }
}
