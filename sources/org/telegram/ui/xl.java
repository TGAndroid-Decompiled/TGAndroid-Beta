package org.telegram.ui;

import android.content.Context;
public final class xl extends org.telegram.ui.Cells.g0 {
    public final fm L;

    public xl(fm fmVar, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, u6Var);
        this.L = fmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        un unVar = this.L.Q;
        int i10 = un.f44171bd;
        return unVar.b9();
    }
}
