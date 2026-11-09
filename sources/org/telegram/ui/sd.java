package org.telegram.ui;

import android.content.Context;
public final class sd extends org.telegram.ui.Components.sj0 {
    public final vd f49885c0;

    public sd(vd vdVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, zd zdVar) {
        super(context, g6Var, zdVar);
        this.f49885c0 = vdVar;
    }

    @Override
    public final boolean canScrollHorizontally(int i7) {
        if (this.f49885c0.f50663x.Q0 && super.canScrollHorizontally(i7)) {
            return true;
        }
        return false;
    }
}
