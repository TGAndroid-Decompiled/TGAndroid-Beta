package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
public final class g extends k41 {
    public static final int f53091b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(android.view.View r27, org.telegram.ui.Components.l41 r28, boolean r29, org.telegram.ui.Components.z41 r30, org.telegram.ui.Components.e51 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g.b(android.view.View, org.telegram.ui.Components.l41, boolean, org.telegram.ui.Components.z41, org.telegram.ui.Components.e51):void");
    }

    @Override
    public final boolean c(l41 l41Var, l41 l41Var2) {
        if (l41Var.I == l41Var2.I && TextUtils.equals(l41Var.f37019n, l41Var2.f37019n)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        return new h(context, i6Var);
    }

    @Override
    public final boolean e(l41 l41Var, l41 l41Var2) {
        if (l41Var.I == l41Var2.I && TextUtils.isEmpty(l41Var.f37019n) == TextUtils.isEmpty(l41Var2.f37019n)) {
            return true;
        }
        return false;
    }
}
