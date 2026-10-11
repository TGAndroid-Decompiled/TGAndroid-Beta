package org.telegram.ui;

import android.content.Context;
public final class sk extends jh.e {
    public final zn L;

    public sk(zn znVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, kj kjVar, ah.c cVar) {
        super(cVar, context, kjVar, d6Var);
        this.L = znVar;
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
