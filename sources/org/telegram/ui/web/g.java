package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.zl0;
public final class g extends f61 {
    public static final int f42184a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(android.view.View r27, org.telegram.ui.Components.g61 r28, boolean r29, org.telegram.ui.Components.u61 r30, org.telegram.ui.Components.c71 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.g.bindView(android.view.View, org.telegram.ui.Components.g61, boolean, org.telegram.ui.Components.u61, org.telegram.ui.Components.c71):void");
    }

    @Override
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        if (g61Var.H == g61Var2.H && TextUtils.equals(g61Var.f26670m, g61Var2.f26670m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new h(context, d6Var);
    }

    @Override
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        if (g61Var.H == g61Var2.H && TextUtils.isEmpty(g61Var.f26670m) == TextUtils.isEmpty(g61Var2.f26670m)) {
            return true;
        }
        return false;
    }
}
