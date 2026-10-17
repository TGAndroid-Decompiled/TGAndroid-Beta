package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
public final class g extends e61 {
    public static final int f42600a = 0;

    static {
        e61.setup(new e61());
    }

    @Override
    public final void bindView(android.view.View r27, org.telegram.ui.Components.f61 r28, boolean r29, org.telegram.ui.Components.s61 r30, org.telegram.ui.Components.a71 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g.bindView(android.view.View, org.telegram.ui.Components.f61, boolean, org.telegram.ui.Components.s61, org.telegram.ui.Components.a71):void");
    }

    @Override
    public final boolean contentsEquals(f61 f61Var, f61 f61Var2) {
        if (f61Var.H == f61Var2.H && TextUtils.equals(f61Var.f26141m, f61Var2.f26141m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new h(context, d6Var);
    }

    @Override
    public final boolean equals(f61 f61Var, f61 f61Var2) {
        if (f61Var.H == f61Var2.H && TextUtils.isEmpty(f61Var.f26141m) == TextUtils.isEmpty(f61Var2.f26141m)) {
            return true;
        }
        return false;
    }
}
