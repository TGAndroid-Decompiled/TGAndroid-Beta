package org.telegram.ui;

import android.content.Context;
public final class sd extends org.telegram.ui.Components.rj0 {
    public final vd f49729c0;

    public sd(vd vdVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, zd zdVar) {
        super(context, f6Var, zdVar);
        this.f49729c0 = vdVar;
    }

    @Override
    public final boolean canScrollHorizontally(int i7) {
        if (this.f49729c0.f50699x.Q0 && super.canScrollHorizontally(i7)) {
            return true;
        }
        return false;
    }
}
