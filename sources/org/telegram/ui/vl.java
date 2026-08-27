package org.telegram.ui;

import android.content.Context;

public final class vl extends org.telegram.ui.Cells.h0 {
    public final dm H;

    public vl(dm dmVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.H = dmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        rn rnVar = this.H.M;
        int i10 = rn.Dc;
        return rnVar.R8();
    }
}
