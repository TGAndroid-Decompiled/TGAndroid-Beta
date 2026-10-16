package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class g extends l61 {
    public static final int f41040a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(android.view.View r27, org.telegram.ui.Components.m61 r28, boolean r29, org.telegram.ui.Components.a71 r30, org.telegram.ui.Components.i71 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g.bindView(android.view.View, org.telegram.ui.Components.m61, boolean, org.telegram.ui.Components.a71, org.telegram.ui.Components.i71):void");
    }

    @Override
    public final boolean contentsEquals(m61 m61Var, m61 m61Var2) {
        if (m61Var.H == m61Var2.H && TextUtils.equals(m61Var.f26947m, m61Var2.f26947m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new h(context, c6Var);
    }

    @Override
    public final boolean equals(m61 m61Var, m61 m61Var2) {
        if (m61Var.H == m61Var2.H && TextUtils.isEmpty(m61Var.f26947m) == TextUtils.isEmpty(m61Var2.f26947m)) {
            return true;
        }
        return false;
    }
}
