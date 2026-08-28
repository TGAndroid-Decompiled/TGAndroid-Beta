package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
public final class g extends k41 {
    public static final int f43857a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(android.view.View r27, org.telegram.ui.Components.l41 r28, boolean r29, org.telegram.ui.Components.z41 r30, org.telegram.ui.Components.i51 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g.bindView(android.view.View, org.telegram.ui.Components.l41, boolean, org.telegram.ui.Components.z41, org.telegram.ui.Components.i51):void");
    }

    @Override
    public final boolean contentsEquals(l41 l41Var, l41 l41Var2) {
        if (l41Var.H == l41Var2.H && TextUtils.equals(l41Var.f30340m, l41Var2.f30340m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        return new h(context, b6Var);
    }

    @Override
    public final boolean equals(l41 l41Var, l41 l41Var2) {
        if (l41Var.H == l41Var2.H && TextUtils.isEmpty(l41Var.f30340m) == TextUtils.isEmpty(l41Var2.f30340m)) {
            return true;
        }
        return false;
    }
}
