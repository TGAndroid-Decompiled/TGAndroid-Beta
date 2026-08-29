package org.telegram.ui;

import android.content.Context;
public final class xl extends org.telegram.ui.Cells.b0 {
    public final em f44604f;

    public xl(em emVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.f44604f = emVar;
    }

    @Override
    public final int getSideMenuWidth() {
        tn tnVar = this.f44604f.M;
        int i10 = tn.Dc;
        return tnVar.R8();
    }
}
