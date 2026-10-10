package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class g extends p61 {
    public static final int f43349a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(android.view.View r27, org.telegram.ui.Components.q61 r28, boolean r29, org.telegram.ui.Components.d71 r30, org.telegram.ui.Components.l71 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g.bindView(android.view.View, org.telegram.ui.Components.q61, boolean, org.telegram.ui.Components.d71, org.telegram.ui.Components.l71):void");
    }

    @Override
    public final boolean contentsEquals(q61 q61Var, q61 q61Var2) {
        if (q61Var.H == q61Var2.H && TextUtils.equals(q61Var.f30064m, q61Var2.f30064m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, e6 e6Var) {
        return new h(context, e6Var);
    }

    @Override
    public final boolean equals(q61 q61Var, q61 q61Var2) {
        if (q61Var.H == q61Var2.H && TextUtils.isEmpty(q61Var.f30064m) == TextUtils.isEmpty(q61Var2.f30064m)) {
            return true;
        }
        return false;
    }
}
