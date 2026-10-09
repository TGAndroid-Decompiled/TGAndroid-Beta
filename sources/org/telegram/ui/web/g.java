package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
public final class g extends o61 {
    public static final int f43305a = 0;

    static {
        o61.setup(new o61());
    }

    @Override
    public final void bindView(android.view.View r27, org.telegram.ui.Components.p61 r28, boolean r29, org.telegram.ui.Components.c71 r30, org.telegram.ui.Components.k71 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g.bindView(android.view.View, org.telegram.ui.Components.p61, boolean, org.telegram.ui.Components.c71, org.telegram.ui.Components.k71):void");
    }

    @Override
    public final boolean contentsEquals(p61 p61Var, p61 p61Var2) {
        if (p61Var.H == p61Var2.H && TextUtils.equals(p61Var.f29735m, p61Var2.f29735m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, e6 e6Var) {
        return new h(context, e6Var);
    }

    @Override
    public final boolean equals(p61 p61Var, p61 p61Var2) {
        if (p61Var.H == p61Var2.H && TextUtils.isEmpty(p61Var.f29735m) == TextUtils.isEmpty(p61Var2.f29735m)) {
            return true;
        }
        return false;
    }
}
