package org.telegram.ui;

import android.content.Context;
public final class xl extends org.telegram.ui.Cells.h0 {
    public final fm L;

    public xl(fm fmVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.L = fmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        sn snVar = this.L.Q;
        int i10 = sn.Ic;
        return snVar.W8();
    }
}
