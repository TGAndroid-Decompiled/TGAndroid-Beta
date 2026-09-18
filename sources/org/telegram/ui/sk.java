package org.telegram.ui;

import android.content.Context;
public final class sk extends jh.e {
    public final bo L;

    public sk(bo boVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, kj kjVar, ah.c cVar) {
        super(cVar, context, kjVar, f6Var);
        this.L = boVar;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        j6.l lVar = this.L.Ac;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0) {
            z11 = true;
        }
        lVar.j(3, z10, z11);
    }
}
