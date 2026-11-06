package org.telegram.ui;

import android.content.Context;
public final class uj extends lh.e {
    public final an L;

    public uj(an anVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, oi oiVar, dh.c cVar) {
        super(context, cVar, oiVar, f6Var);
        this.L = anVar;
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z9;
        super.setVisibility(i7);
        m6.n nVar = this.L.f43797fd;
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
