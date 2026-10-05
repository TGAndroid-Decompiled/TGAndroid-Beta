package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.zl0;
public final class g extends g61 {
    public static final int f42203a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(android.view.View r27, org.telegram.ui.Components.h61 r28, boolean r29, org.telegram.ui.Components.w61 r30, org.telegram.ui.Components.e71 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g.bindView(android.view.View, org.telegram.ui.Components.h61, boolean, org.telegram.ui.Components.w61, org.telegram.ui.Components.e71):void");
    }

    @Override
    public final boolean contentsEquals(h61 h61Var, h61 h61Var2) {
        if (h61Var.H == h61Var2.H && TextUtils.equals(h61Var.f27094m, h61Var2.f27094m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new h(context, d6Var);
    }

    @Override
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        if (h61Var.H == h61Var2.H && TextUtils.isEmpty(h61Var.f27094m) == TextUtils.isEmpty(h61Var2.f27094m)) {
            return true;
        }
        return false;
    }
}
