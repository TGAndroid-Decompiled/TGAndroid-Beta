package org.telegram.ui;

import android.content.Context;
public final class wl extends org.telegram.ui.Cells.h0 {
    public final em H;

    public wl(em emVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.H = emVar;
    }

    @Override
    public final int getSideMenuWidth() {
        tn tnVar = this.H.M;
        int i10 = tn.Dc;
        return tnVar.R8();
    }
}
