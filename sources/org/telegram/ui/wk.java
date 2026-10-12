package org.telegram.ui;

import android.content.Context;
public final class wk extends jh.e {
    public final eo L;

    public wk(eo eoVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, oj ojVar, ah.c cVar) {
        super(cVar, context, ojVar, c6Var);
        this.L = eoVar;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        j6.l lVar = this.L.Bc;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0) {
            z11 = true;
        }
        lVar.i(3, z10, z11);
    }
}
