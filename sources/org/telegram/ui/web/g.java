package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class g extends m41 {
    public static final int f53373b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(android.view.View r27, org.telegram.ui.Components.n41 r28, boolean r29, org.telegram.ui.Components.b51 r30, org.telegram.ui.Components.g51 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g.b(android.view.View, org.telegram.ui.Components.n41, boolean, org.telegram.ui.Components.b51, org.telegram.ui.Components.g51):void");
    }

    @Override
    public final boolean c(n41 n41Var, n41 n41Var2) {
        if (n41Var.I == n41Var2.I && TextUtils.equals(n41Var.f37656n, n41Var2.f37656n)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        return new h(context, i6Var);
    }

    @Override
    public final boolean e(n41 n41Var, n41 n41Var2) {
        if (n41Var.I == n41Var2.I && TextUtils.isEmpty(n41Var.f37656n) == TextUtils.isEmpty(n41Var2.f37656n)) {
            return true;
        }
        return false;
    }
}
