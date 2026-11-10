package org.telegram.ui;

import android.content.Context;
public final class sd extends org.telegram.ui.Components.rj0 {
    public final vd f49832c0;

    public sd(vd vdVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, zd zdVar) {
        super(context, h6Var, zdVar);
        this.f49832c0 = vdVar;
    }

    @Override
    public final boolean canScrollHorizontally(int i7) {
        if (this.f49832c0.f50713x.Q0 && super.canScrollHorizontally(i7)) {
            return true;
        }
        return false;
    }
}
