package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xl0;
public final class g extends v51 {
    public static final int f39060a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(android.view.View r27, org.telegram.ui.Components.w51 r28, boolean r29, org.telegram.ui.Components.k61 r30, org.telegram.ui.Components.s61 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g.bindView(android.view.View, org.telegram.ui.Components.w51, boolean, org.telegram.ui.Components.k61, org.telegram.ui.Components.s61):void");
    }

    @Override
    public final boolean contentsEquals(w51 w51Var, w51 w51Var2) {
        if (w51Var.H == w51Var2.H && TextUtils.equals(w51Var.f29896m, w51Var2.f29896m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, xl0 xl0Var, int i10, int i11, d6 d6Var) {
        return new h(context, d6Var);
    }

    @Override
    public final boolean equals(w51 w51Var, w51 w51Var2) {
        if (w51Var.H == w51Var2.H && TextUtils.isEmpty(w51Var.f29896m) == TextUtils.isEmpty(w51Var2.f29896m)) {
            return true;
        }
        return false;
    }
}
