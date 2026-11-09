package org.telegram.ui;

import android.content.Context;
public final class wj extends lh.e {
    public final cn L;

    public wj(cn cnVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, qi qiVar, dh.c cVar) {
        super(context, cVar, qiVar, g6Var);
        this.L = cnVar;
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z9;
        super.setVisibility(i7);
        m6.n nVar = this.L.f44485hd;
        boolean z10 = false;
        if (i7 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getMeasuredWidth() > 0) {
            z10 = true;
        }
        nVar.h(3, z9, z10);
    }
}
