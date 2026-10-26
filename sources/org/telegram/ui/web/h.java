package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class h extends s61 {
    public static final int f45255a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(android.view.View r27, org.telegram.ui.Components.t61 r28, boolean r29, org.telegram.ui.Components.j71 r30, org.telegram.ui.Components.r71 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.h.bindView(android.view.View, org.telegram.ui.Components.t61, boolean, org.telegram.ui.Components.j71, org.telegram.ui.Components.r71):void");
    }

    @Override
    public final boolean contentsEquals(t61 t61Var, t61 t61Var2) {
        if (t61Var.H == t61Var2.H && TextUtils.equals(t61Var.f32876m, t61Var2.f32876m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        return new i(context, u6Var);
    }

    @Override
    public final boolean equals(t61 t61Var, t61 t61Var2) {
        if (t61Var.H == t61Var2.H && TextUtils.isEmpty(t61Var.f32876m) == TextUtils.isEmpty(t61Var2.f32876m)) {
            return true;
        }
        return false;
    }
}
