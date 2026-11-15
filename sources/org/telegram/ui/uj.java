package org.telegram.ui;

import android.content.Context;
public final class uj extends lh.e {
    public final an M;

    public uj(an anVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, oi oiVar, dh.c cVar) {
        super(context, cVar, oiVar, e6Var);
        this.M = anVar;
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z10;
        super.setVisibility(i7);
        m6.n nVar = this.M.f45238id;
        boolean z11 = false;
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0) {
            z11 = true;
        }
        nVar.h(3, z10, z11);
    }
}
