package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class g extends n41 {
    public static final int f53138b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(android.view.View r27, org.telegram.ui.Components.o41 r28, boolean r29, org.telegram.ui.Components.c51 r30, org.telegram.ui.Components.h51 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g.b(android.view.View, org.telegram.ui.Components.o41, boolean, org.telegram.ui.Components.c51, org.telegram.ui.Components.h51):void");
    }

    @Override
    public final boolean c(o41 o41Var, o41 o41Var2) {
        if (o41Var.I == o41Var2.I && TextUtils.equals(o41Var.f38092n, o41Var2.f38092n)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        return new h(context, h6Var);
    }

    @Override
    public final boolean e(o41 o41Var, o41 o41Var2) {
        if (o41Var.I == o41Var2.I && TextUtils.isEmpty(o41Var.f38092n) == TextUtils.isEmpty(o41Var2.f38092n)) {
            return true;
        }
        return false;
    }
}
